package com.example.dagger_session_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger_session_demo.application.BaseApplication
import com.example.dagger_session_demo.data.models.Product
import com.example.dagger_session_demo.data.models.User
import com.example.dagger_session_demo.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var product1: Product
    @Inject
    lateinit var product2: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent = (application as BaseApplication).appComponent
        val productComponent = appComponent.getProductComponentBuilder().quantity(2).price(150).build()
        productComponent.inject(this)


        Log.d(TAG, "onCreate: --------------------- product1 ---------------------")

        Log.d(TAG, "onCreate: product1 $product1")
        Log.d(TAG, "onCreate: product1 user = ${product1.user}")
        Log.d(TAG, "onCreate: product1 seller = ${product1.seller}")

        Log.d(TAG, "onCreate: --------------------- product2 ---------------------")

        Log.d(TAG, "onCreate: product1 $product2")
        Log.d(TAG, "onCreate: product1 user = ${product2.user}")
        Log.d(TAG, "onCreate: product1 seller = ${product2.seller}")

    }
}