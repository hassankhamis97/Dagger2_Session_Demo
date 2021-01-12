package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.data.models.User
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ProductModule {
    @ProductScope
    @Provides
    fun getUser(): User = User()

    @ProductScope
    @Provides
    fun getWelcomeMessage(): String = "Welcome"
}