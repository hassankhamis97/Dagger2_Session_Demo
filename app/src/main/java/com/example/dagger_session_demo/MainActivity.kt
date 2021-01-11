package com.example.dagger_session_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger_session_demo.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val product = DaggerAppComponent.builder().build().product
        Log.d(TAG, "onCreate: $product")
    }
}