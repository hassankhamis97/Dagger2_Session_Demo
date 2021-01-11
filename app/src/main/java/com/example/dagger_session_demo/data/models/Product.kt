package com.example.dagger_session_demo.data.models

import com.example.dagger_session_demo.di.Quantity
import javax.inject.Inject
import javax.inject.Named

data class Product @Inject constructor(
        val user: User,
        @Quantity
        var quantity: Int,
        @Named("price")
        var price: Int
)