package com.example.baseandroid.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.support.annotation.VisibleForTesting
import com.example.baseandroid.domain.usercase.SorianaInfouserCase
import com.example.baseandroid.domain.usercase.impl.SorianaInfoUserCaseImpl
import com.example.baseandroid.repository.SorianaRepository
import com.example.baseandroid.repository.data.response.SorianaOut
import com.icom.base_livedata.utils.Resource
import javax.inject.Inject

class MainViewModel
@Inject
constructor(repository: SorianaRepository) : ViewModel() {

    @VisibleForTesting
    private var mSorianaInfoUserCase: SorianaInfouserCase? = null

    var getSorianaInfoResourceLiveData : LiveData<Resource<SorianaOut>> ? = null

    init {
        mSorianaInfoUserCase = SorianaInfoUserCaseImpl(repository)
        getSorianaInfoResourceLiveData = (mSorianaInfoUserCase as SorianaInfoUserCaseImpl).getSorianaInfoResourceLiveData
    }

    fun loadSorianInfo() {
        mSorianaInfoUserCase?.getSorianaInfo()
    }


}