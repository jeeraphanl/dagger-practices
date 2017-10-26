package com.naversaybugs.sampledagger.dagger.modules

import com.naversaybugs.sampledagger.models.entities.House
import dagger.Module
import dagger.Provides

@Module
class HouseModule {
    
    @Provides
    fun provideHouse() = House("00", "no name", "empty")
}