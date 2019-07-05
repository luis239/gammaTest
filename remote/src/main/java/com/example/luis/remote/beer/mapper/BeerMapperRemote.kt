package com.example.luis.remote.beer.mapper

import com.example.luis.remote.beer.model.BeerRemote
import com.example.luis.repository.beer.model.BeerData

fun BeerRemote.mapToData():BeerData{
    return BeerData(description, firstBrewed, id, imageUrl, name, ph, tagline)
}