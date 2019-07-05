package com.example.luis.repository.beer.mapper

import com.example.luis.domain.beer.model.BeerModel
import com.example.luis.repository.beer.model.BeerData


fun BeerData.mapToModel() : BeerModel{
    return BeerModel(description, firstBrewed, id, imageUrl, name, ph, tagline)
}