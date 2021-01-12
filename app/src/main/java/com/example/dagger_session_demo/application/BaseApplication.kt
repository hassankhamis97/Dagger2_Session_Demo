package com.example.dagger_session_demo.application

import android.app.Application
import com.example.dagger_session_demo.di.DaggerAppComponent

class BaseApplication: Application() {
    val appComponent = DaggerAppComponent.builder().quantity(5).price(8).build()
}