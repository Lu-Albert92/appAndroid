package com.example.baseandroid.domain.usercase.impl

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.support.annotation.VisibleForTesting
import com.example.baseandroid.domain.usercase.SorianaInfouserCase
import com.example.baseandroid.repository.SorianaRepository
import com.example.baseandroid.repository.data.response.SorianaOut
import com.icom.base_livedata.utils.AbsentLiveData
import com.icom.base_livedata.utils.Resource
import javax.inject.Inject


class SorianaInfoUserCaseImpl
@Inject
constructor(repository: SorianaRepository) : SorianaInfouserCase {


    @VisibleForTesting
    private val sorianaInfoMutableLiveData: MutableLiveData<Boolean> = MutableLiveData()
    var getSorianaInfoResourceLiveData: LiveData<Resource<SorianaOut>>


    init {
        getSorianaInfoResourceLiveData = Transformations.switchMap(sorianaInfoMutableLiveData) {
            if (it == false) {
                AbsentLiveData.create()
            } else {
                repository.getSorianaInfo()
            }
        }
    }


    fun loadSorianInfo(fetchData: Boolean) {
        if (sorianaInfoMutableLiveData.value == fetchData) {
            return
        }
        sorianaInfoMutableLiveData.value = fetchData
    }

    override fun getSorianaInfo() {
        loadSorianInfo(true)
    }


}