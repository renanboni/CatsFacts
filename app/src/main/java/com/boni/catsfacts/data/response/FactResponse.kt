package com.boni.catsfacts.data.response

import com.boni.catsfacts.data.model.Fact
import com.boni.catsfacts.data.model.User

class FactResponse(val all: List<Fact>, val me: User)