package com.example.luis.repository.beer.repository

import com.example.luis.repository.beer.model.BeerData
import io.reactivex.Single

interface BeerRemote {

        fun getBeers() : Single<List<BeerData>>
}