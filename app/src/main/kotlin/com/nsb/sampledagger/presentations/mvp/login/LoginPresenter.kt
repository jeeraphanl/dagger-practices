package com.nsb.sampledagger.presentations.mvp.login

import android.content.SharedPreferences

class LoginPresenter(
        private val view: LoginContract.View,
        private val sharePref: SharedPreferences
) : LoginContract.Presenter {
    
    /**
     * Presenter
     */
    override fun saveUserName() {
        sharePref.edit().putString("Sameple Dagger2", "").apply()
        view.showUserName()
    }
}