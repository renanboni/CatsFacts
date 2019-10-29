package com.boni.catsfacts.data.model

import java.util.*

class Fact(
    val id: String,
    val _v: Int,
    val text: String,
    val updatedAt: Date,
    val sendDate: Date,
    val deleted: Boolean,
    val source: String,
    val used: Boolean,
    val type: String
)