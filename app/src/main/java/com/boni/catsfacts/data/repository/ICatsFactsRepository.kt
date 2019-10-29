package com.boni.catsfacts.data.repository

import com.boni.catsfacts.data.response.FactResponse

interface ICatsFactsRepository {
    suspend fun getFacts(): FactResponse
}