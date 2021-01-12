package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.data.models.User
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun getUser(): User = User()

    @Singleton
    @Provides
    fun getWelcomeMessage(): String = "Welcome"
}