package com.example.dagger_session_demo.data.models

import javax.inject.Inject
import javax.inject.Named

data class Product @Inject constructor(
        val user: User,
        @Named("quantity")
        var quantity: Int,
        @Named("price")
        var price: Int
)