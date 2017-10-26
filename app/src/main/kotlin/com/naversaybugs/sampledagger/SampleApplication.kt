package com.naversaybugs.sampledagger

import android.app.Application
import com.naversaybugs.sampledagger.dagger.components.AppComponent
import com.naversaybugs.sampledagger.dagger.components.DaggerAppComponent
import com.naversaybugs.sampledagger.dagger.modules.AppModule

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