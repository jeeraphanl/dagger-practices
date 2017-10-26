package com.naversaybugs.sampledagger.dagger.modules

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
    fun provideSharedPref1(context: Context): SharedPreferences
            = context.getSharedPreferences("SharedPref1", Context.MODE_PRIVATE
    )
    
    @Named("SharedPref2")
    @Singleton
    @Provides
    fun provideSharedPref2(context: Context): SharedPreferences
            = context.getSharedPreferences("SharedPref2", Context.MODE_PRIVATE
    )
}
