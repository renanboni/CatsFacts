package com.boni.catsfacts.di

import com.boni.catsfacts.data.repository.CatsFactsRepository
import com.boni.catsfacts.data.repository.ICatsFactsRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ICatsFactsRepository> { CatsFactsRepository(get()) }
}