package com.nsb.sampledagger.presentations.mvp.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.nsb.sampledagger.SampleApplication
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginContract.View {
    
    @Inject lateinit var presenter: LoginPresenter
    
    /**
     * Lifecycle activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        SampleApplication.loginComponent.inject(this)
        
        presenter.saveUserName()
    }
    
    /**
     * View
     */
    override fun showUserName() {
        Log.d("log-dagger", "showUserName")
    }
}