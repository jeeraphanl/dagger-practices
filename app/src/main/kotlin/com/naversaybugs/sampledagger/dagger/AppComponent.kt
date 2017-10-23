package com.naversaybugs.sampledagger.dagger

import com.naversaybugs.sampledagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        SharedPrefModule::class,
        HouseModule::class
))

interface AppComponent {
    fun inject(activity: MainActivity)
}