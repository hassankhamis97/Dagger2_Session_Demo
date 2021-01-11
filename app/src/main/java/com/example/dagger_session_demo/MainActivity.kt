package com.example.dagger_session_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger_session_demo.data.models.User
import com.example.dagger_session_demo.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val product = DaggerAppComponent.builder().quantity(5).price(8).build().product
        Log.d(TAG, "onCreate: $product")
        Log.d(TAG, "onCreate: quantity = ${product.quantity}")
        Log.d(TAG, "onCreate: price = ${product.price}")
    }
}