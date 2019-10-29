package com.boni.catsfacts.data.model

class Fact(
    val id: String,
    val text: String,
    val type: String,
    val user: User,
    val upvotes: Int,
    val userUpvoted: Boolean
)