package com.nsb.sampledagger.presentations.mvp.login

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.nsb.sampledagger.R

class LoginPresenter(
        private val view: LoginContract.View,
        private val context: Context,
        private val sharePref: SharedPreferences
) : LoginContract.Presenter {
    
    /**
     * Presenter
     */
    override fun saveUserName() {
        Log.d("log-dagger", "saveUserName")
        sharePref.edit().putString(context.getString(R.string.app_name), "").apply()
    
        view.showUserName()
    }
}