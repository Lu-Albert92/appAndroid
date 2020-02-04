package com.example.baseandroid.repository.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable


class DataResponse : Serializable {

    @SerializedName("message")
    @Expose
    val message: String? = null

}