package com.boni.catsfacts.di

import com.boni.catsfacts.BuildConfig
import com.boni.catsfacts.data.service.CatsFactsService
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    factory { provideOkHttpClient() }
    factory { provideFreeNowApi(get()) }
    single { provideRetrofit(get()) }
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BuildConfig.URL_API)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun provideOkHttpClient(): OkHttpClient {
    return OkHttpClient()
        .newBuilder()
        .build()
}

fun provideFreeNowApi(retrofit: Retrofit): CatsFactsService = retrofit.create(CatsFactsService::class.java)