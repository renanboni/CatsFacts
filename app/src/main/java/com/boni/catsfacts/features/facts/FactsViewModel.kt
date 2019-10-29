package com.boni.catsfacts.features.facts

import androidx.lifecycle.ViewModel
import com.boni.catsfacts.data.repository.ICatsFactsRepository

class FactsViewModel(private val catsFactsRepository: ICatsFactsRepository) : ViewModel() {


    fun doFactsRequest() {

    }
}