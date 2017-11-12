package com.nsb.sampledagger

import android.app.Application
import com.nsb.sampledagger.dagger.components.AppComponent
import com.nsb.sampledagger.dagger.components.DaggerAppComponent
import com.nsb.sampledagger.dagger.modules.AppModule

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