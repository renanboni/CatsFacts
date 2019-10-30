package com.boni.catsfacts.features.facts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.boni.catsfacts.base.BaseViewModel
import com.boni.catsfacts.data.model.Fact
import com.boni.catsfacts.data.repository.ICatsFactsRepository
import kotlinx.coroutines.launch

class FactsViewModel(private val catsFactsRepository: ICatsFactsRepository) : BaseViewModel() {

    private val factsLiveData = MutableLiveData<FactsViewState.Facts>()
    val facts: LiveData<FactsViewState.Facts> = factsLiveData

    fun doFactsRequest() {
        viewModelScope.launch {
            val cats = catsFactsRepository.getFacts()
            factsLiveData.postValue(FactsViewState.Facts(cats.all))
        }
    }
}

sealed class FactsViewState {
    data class Facts(val facts: List<Fact>) : FactsViewState()
}