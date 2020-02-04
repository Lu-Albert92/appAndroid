package com.example.baseandroid.repository

import android.arch.lifecycle.LiveData
import com.icom.base_livedata.repository.api.ApiResponse
import com.example.baseandroid.repository.api.ApiServer
import com.example.baseandroid.repository.data.response.SorianaInfoResponse
import com.example.baseandroid.repository.data.response.SorianaOut
import com.icom.base_livedata.repository.ProcessedNetworkResource
import com.icom.base_livedata.utils.Resource
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SorianaRepository
@Inject
constructor(private val sampleApi: ApiServer) {

    fun getSorianaInfo(): LiveData<Resource<SorianaOut>> {
        return object : ProcessedNetworkResource<SorianaInfoResponse, SorianaOut>() {
            override fun createCall(): LiveData<ApiResponse<SorianaInfoResponse>> =
                    sampleApi.getSorianaInfo()

            override fun processResponse(response: SorianaInfoResponse): SorianaOut? =
                response.sorianaResponse
        }.asLiveData()
    }


}