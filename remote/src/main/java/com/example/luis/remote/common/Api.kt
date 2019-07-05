package com.example.luis.remote.common

import com.example.luis.remote.beer.model.BeerRemote
import io.reactivex.Single
import retrofit2.http.GET

interface Api {
    @GET("beers")
    fun getListBeers(): Single<List<BeerRemote>>
}