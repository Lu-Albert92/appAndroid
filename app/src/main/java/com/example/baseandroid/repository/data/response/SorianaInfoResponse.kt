package com.example.baseandroid.repository.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class SorianaInfoResponse {

    @SerializedName("message")
    @Expose
    val message: String? = null

    @SerializedName("response")
    @Expose
    val sorianaResponse: SorianaOut? = null

    @SerializedName("status")
    @Expose
    val status: String = ""
}