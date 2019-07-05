package com.example.luis.repository.beer.model


data class BeerData(
    val description: String?,
    val firstBrewed: String?,
    val id: Int?,
    val imageUrl: String?,
    val name: String?,
    val ph: Double?,
    val tagline: String?
)