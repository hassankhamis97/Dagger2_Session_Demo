package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.data.models.User
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun getUser(): User = User()

    @Provides
    fun getWelcomeMessage(): String = "Welcome"
}