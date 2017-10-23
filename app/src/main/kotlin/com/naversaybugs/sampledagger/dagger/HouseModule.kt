package com.naversaybugs.sampledagger.dagger

import com.naversaybugs.sampledagger.models.House
import dagger.Module
import dagger.Provides

@Module
class HouseModule {
    
    @Provides
    fun provideHouse() = House("Stark", true)
}