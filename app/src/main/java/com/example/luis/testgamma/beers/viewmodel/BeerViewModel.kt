package com.example.luis.testgamma.beers.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.luis.domain.beer.GetBeerListUseCase
import com.example.luis.domain.beer.GetTimestampUseCase
import com.example.luis.domain.beer.SaveTimestampUseCsae
import com.example.luis.domain.beer.model.BeerModel
import com.example.luis.testgamma.common.Resource
import io.reactivex.observers.DisposableCompletableObserver
import io.reactivex.observers.DisposableMaybeObserver
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class BeerViewModel @Inject constructor(
    private val getBeerListUseCase: GetBeerListUseCase,
    private val getTimestampUseCase: GetTimestampUseCase,
    private val saveTimestampUseCsae: SaveTimestampUseCsae
):ViewModel() {

    val beerListLiveData = MutableLiveData<Resource<List<BeerModel>>>()
    val date = MutableLiveData<String>()

    init {
        getTimestamp()
        getListBeers()

    }

    private fun getTimestamp() {
        getTimestampUseCase.execute(object : DisposableMaybeObserver<String>(){
            override fun onSuccess(t: String) {
                date.value = t
            }

            override fun onComplete() {

            }

            override fun onError(e: Throwable) {
                e.printStackTrace()
            }

        })
    }

    private fun getListBeers() {
        beerListLiveData.postValue(Resource.loading())
        getBeerListUseCase.execute(object : DisposableSingleObserver<List<BeerModel>>(){
            override fun onSuccess(t: List<BeerModel>) {
                beerListLiveData.postValue(Resource.next(t))
            }

            override fun onError(e: Throwable) {
                e.printStackTrace()
                beerListLiveData.postValue(Resource.error(e.message))
            }

        })
    }

    fun saveTimestamp(){
        saveTimestampUseCsae.execute(object : DisposableCompletableObserver(){
            override fun onComplete() {

            }

            override fun onError(e: Throwable) {

            }

        })
    }
}