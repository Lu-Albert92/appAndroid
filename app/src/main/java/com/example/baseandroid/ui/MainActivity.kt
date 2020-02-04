package com.example.baseandroid.ui

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.widget.Toast
import com.example.baseandroid.R
import com.example.baseandroid.viewmodel.MainViewModel
import com.icom.base_livedata.utils.Status
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var userViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        userViewModel.loadSorianInfo()
        subscribeToUserModel()
    }

    private fun subscribeToUserModel() {
        userViewModel.getSorianaInfoResourceLiveData?.observe(this, Observer {
            when (it!!.status) {
                Status.SUCCESS -> {
                    Toast.makeText(this, it.data?.facebookUrl, Toast.LENGTH_SHORT).show()
                }
                Status.ERROR -> {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
                Status.LOADING -> {
                    Toast.makeText(this, "progress", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}
