package com.nsb.sampledagger.dagger.modules

import com.nsb.sampledagger.models.entities.House
import dagger.Module
import dagger.Provides

@Module
class HouseModule {
    
    @Provides
    fun provideHouse() = House("00", "no name", "empty")
}