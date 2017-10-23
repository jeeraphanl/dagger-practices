package com.naversaybugs.sampledagger

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.naversaybugs.sampledagger.models.House
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    
    @field:[Named("SharedPref1")]
    @Inject lateinit var sharePref1: SharedPreferences
    
    @field:[Named("SharedPref2")]
    @Inject lateinit var sharePref2: SharedPreferences
    
    @Inject lateinit var context: Context
    @Inject lateinit var house: House

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleApplication.appComponent.inject(this)
    
        sharePref1.edit().putString("key", "sample dagger2 sharepref1").apply()
        Log.d("log-dagger", sharePref1.getString("key", ""))
        
        sharePref2.edit().putString("key", "sample dagger2 sharepref2").apply()
        Log.d("log-dagger", sharePref2.getString("key", ""))
    
        Log.d("log-dagger", context.getString(R.string.app_name))
        Log.d("log-dagger", house.toString())
    }
}