package com.boni.catsfacts.data.model

class Fact(
    val id: String? = "",
    val text: String? = "",
    val type: String? = "",
    val user: User? = null,
    val upvotes: Int? = 0,
    val userUpvoted: Boolean? = false
)