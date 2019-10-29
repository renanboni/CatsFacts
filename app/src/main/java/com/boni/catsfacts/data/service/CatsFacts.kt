package com.boni.catsfacts.data.service

import retrofit2.http.GET

interface CatsFacts {

    @GET("/facts")
    suspend fun getFacts()
}