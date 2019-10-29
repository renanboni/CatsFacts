package com.boni.catsfacts.features.facts

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.boni.catsfacts.data.repository.ICatsFactsRepository
import kotlinx.coroutines.launch

class FactsViewModel(private val catsFactsRepository: ICatsFactsRepository) : ViewModel() {

    fun doFactsRequest() {
        viewModelScope.launch {
            val cats = catsFactsRepository.getFacts()

            // TO DO
        }
    }
}