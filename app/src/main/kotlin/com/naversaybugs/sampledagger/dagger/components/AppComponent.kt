package com.naversaybugs.sampledagger.dagger.components

import com.naversaybugs.sampledagger.MainActivity
import com.naversaybugs.sampledagger.dagger.modules.AppModule
import com.naversaybugs.sampledagger.dagger.modules.HouseModule
import com.naversaybugs.sampledagger.dagger.modules.NetModule
import com.naversaybugs.sampledagger.dagger.modules.SharedPrefModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        SharedPrefModule::class,
        HouseModule::class,
        NetModule::class
))

interface AppComponent {
    fun inject(activity: MainActivity)
}