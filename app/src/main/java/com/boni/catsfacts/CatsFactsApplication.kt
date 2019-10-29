package com.boni.catsfacts

import android.app.Application
import com.boni.catsfacts.di.networkModule
import com.boni.catsfacts.di.repositoryModule
import com.boni.catsfacts.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CatsFactsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin() {
        startKoin {
            androidContext(this@CatsFactsApplication)
            modules(
                listOf(
                    networkModule,
                    viewModelModule,
                    repositoryModule
                )
            )
        }
    }
}