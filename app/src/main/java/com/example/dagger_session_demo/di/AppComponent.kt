package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.MainActivity
import com.example.dagger_session_demo.data.models.Product
import com.example.dagger_session_demo.data.models.User
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component(modules = [AppModule::class])
interface AppComponent {
    val product: Product

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun quantity(@Named("quantity") quantity: Int): Builder

        @BindsInstance
        fun price(@Named("price") price: Int): Builder

        fun build(): AppComponent
    }
}