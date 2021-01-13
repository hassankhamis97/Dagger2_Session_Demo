package com.example.dagger_session_demo.di

import com.example.dagger_session_demo.MainActivity
import com.example.dagger_session_demo.data.models.Product
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@ProductScope
@Subcomponent(modules = [ProductModule::class])
interface ProductComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        fun quantity(@Named("quantity") quantity: Int): Builder

        @BindsInstance
        fun price(@Named("price") price: Int): Builder

//        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ProductComponent
    }
}