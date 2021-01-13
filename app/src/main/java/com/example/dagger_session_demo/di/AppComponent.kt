package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.MainActivity
import com.example.dagger_session_demo.data.models.Product
import com.example.dagger_session_demo.data.models.Seller
import com.example.dagger_session_demo.data.models.User
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
//    val seller: Seller
    fun getProductComponentBuilder(): ProductComponent.Builder
}