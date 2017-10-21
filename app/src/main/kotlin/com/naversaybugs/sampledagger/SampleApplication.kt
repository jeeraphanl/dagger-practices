package com.naversaybugs.sampledagger

import android.app.Application
import com.naversaybugs.sampledagger.dagger.AppComponent
import com.naversaybugs.sampledagger.dagger.AppModule
import com.naversaybugs.sampledagger.dagger.DaggerAppComponent

class SampleApplication : Application() {
    
    companion object {
        lateinit var appComponent: AppComponent
    }
    
    override fun onCreate() {
        super.onCreate()
        
        appComponent = DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }
}