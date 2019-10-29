package com.boni.catsfacts.data.repository

import com.boni.catsfacts.data.response.FactResponse
import com.boni.catsfacts.data.service.CatsFactsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CatsFactsRepository(private val service: CatsFactsService) : ICatsFactsRepository {
    override suspend fun getFacts(): FactResponse {
        return withContext(Dispatchers.IO) {
            service.getFacts()
        }
    }
}