package com.naversaybugs.sampledagger.dagger

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class SharedPrefModule {
    
    @Named("SharedPref1")
    @Singleton
    @Provides
    fun provideSharedPref1(application: Application): SharedPreferences
            = application.getSharedPreferences("SharedPref1", Context.MODE_PRIVATE
    )
    
    @Named("SharedPref2")
    @Singleton
    @Provides
    fun provideSharedPref2(application: Application): SharedPreferences
            = application.getSharedPreferences("SharedPref2", Context.MODE_PRIVATE
    )
}
