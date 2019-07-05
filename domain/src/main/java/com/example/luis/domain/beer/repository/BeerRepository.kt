package com.example.luis.domain.beer.repository

import com.example.luis.domain.beer.model.BeerModel
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single
import org.joda.time.DateTime

interface BeerRepository {
    fun saveInfo(date:DateTime):Completable
    fun gerDateInfo(): Maybe<String>
    fun getBeerList(): Single<List<BeerModel>>
}