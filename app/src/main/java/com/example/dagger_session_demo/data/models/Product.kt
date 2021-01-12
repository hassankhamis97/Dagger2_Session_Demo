package com.example.dagger_session_demo.data.models

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

data class Product @Inject constructor(
        val user: User,
        @Named("quantity")
        var quantity: Int,
        @Named("price")
        var price: Int
) {
        private val TAG = "onCreate"
        init {
                Log.d(TAG, "init: product")
        }
        @Inject
        fun cost() {
                Log.d(TAG, "cost: ${quantity * price}")
        }
}