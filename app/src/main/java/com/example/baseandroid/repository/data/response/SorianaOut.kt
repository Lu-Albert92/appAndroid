package com.example.baseandroid.repository.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SorianaOut : Serializable {

    @SerializedName("facebookUrl")
    @Expose
    val facebookUrl: String? = ""

    @SerializedName("twitterUrl")
    @Expose
    val twitterUrl: String? = ""

    @SerializedName("instagramUrl")
    @Expose
    val instagramUrl: String? = ""

    @SerializedName("websiteUrl")
    @Expose
    val websiteUrl: String? = ""

    @SerializedName("youtubeUrl")
    @Expose
    val youtubeUrl: String? = ""

    @SerializedName("privacyUrl")
    @Expose
    val privacyUrl: String? = ""


}