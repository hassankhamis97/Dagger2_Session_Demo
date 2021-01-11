package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.data.models.Product
import com.example.dagger_session_demo.data.models.User
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@Component
interface AppComponent {
    val product: Product

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun user(user: User): Builder


        @BindsInstance
        fun quantity(@Quantity quantity: Int): Builder

        @BindsInstance
        fun price(@Named("price") price: Int): Builder

        fun build(): AppComponent
    }
}