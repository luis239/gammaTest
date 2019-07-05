package com.example.luis.remote.beer

import com.example.luis.remote.beer.mapper.mapToData
import com.example.luis.remote.common.Api
import com.example.luis.repository.beer.model.BeerData
import com.example.luis.repository.beer.repository.BeerRemote
import io.reactivex.Single
import javax.inject.Inject

class BeerRemoteImpl @Inject constructor(
    private val service:Api
): BeerRemote {
    override fun getBeers(): Single<List<BeerData>> {
        return service.getListBeers().map {
            it.map {
                it.mapToData()
            }
        }
    }


}