package com.boni.catsfacts.di

import com.boni.catsfacts.features.facts.FactsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { FactsViewModel(get()) }
}