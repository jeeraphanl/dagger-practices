package com.naversaybugs.sampledagger

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    
    @field:[Named("SharedPref2")]
    @Inject
    lateinit var sharePref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SampleApplication.appComponent.inject(this)

        sharePref.edit().putString("key", "sample dagger2").apply()
        Log.d("log-dagger", sharePref.getString("key", ""))
    }
}