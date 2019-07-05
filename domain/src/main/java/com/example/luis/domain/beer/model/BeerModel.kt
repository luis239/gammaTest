package com.example.luis.domain.beer.model


data class BeerModel(
    val description: String?,
    val firstBrewed: String?,
    val id: Int?,
    val imageUrl: String?,
    val name: String?,
    val ph: Double?,
    val tagline: String?
)