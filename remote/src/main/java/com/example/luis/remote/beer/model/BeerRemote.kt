package com.example.luis.remote.beer.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BeerRemote(
    @Expose
    @SerializedName("description")
    val description: String?,
    @Expose
    @SerializedName("first_brewed")
    val firstBrewed: String?,
    @Expose
    @SerializedName("id")
    val id: Int?,
    @Expose
    @SerializedName("image_url")
    val imageUrl: String?,
    @Expose
    @SerializedName("name")
    val name: String?,
    @Expose
    @SerializedName("ph")
    val ph: Double?,
    @Expose
    @SerializedName("tagline")
    val tagline: String?
)