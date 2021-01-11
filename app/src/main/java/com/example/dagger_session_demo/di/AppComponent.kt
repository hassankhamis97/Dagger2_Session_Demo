package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.data.models.Product
import com.example.dagger_session_demo.data.models.User
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {
    val product: Product
}