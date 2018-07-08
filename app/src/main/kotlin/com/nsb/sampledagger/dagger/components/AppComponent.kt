package com.nsb.sampledagger.dagger.components

import android.content.Context
import android.content.SharedPreferences
import com.nsb.sampledagger.dagger.modules.AppModule
import com.nsb.sampledagger.dagger.modules.SharedPrefModule
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        SharedPrefModule::class
))
interface AppComponent {
    
    fun context(): Context
    
    @Named("FirstSharedPref")
    fun sharedPreferences(): SharedPreferences
}