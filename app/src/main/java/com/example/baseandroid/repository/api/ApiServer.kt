package com.example.baseandroid.repository.api

import android.arch.lifecycle.LiveData
import com.example.baseandroid.repository.data.response.SorianaInfoResponse
import com.icom.base_livedata.repository.api.ApiResponse
import retrofit2.http.GET

interface ApiServer {

    @GET("SorianaInfo")
    fun getSorianaInfo(): LiveData<ApiResponse<SorianaInfoResponse>>

}