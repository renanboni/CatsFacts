package com.boni.catsfacts.data.service

import com.boni.catsfacts.data.response.FactResponse
import retrofit2.http.GET

interface CatsFactsService {

    @GET("/facts")
    suspend fun getFacts(): FactResponse
}