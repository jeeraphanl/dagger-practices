package com.nsb.sampledagger.presentations.mvp.register

import android.content.Context
import android.content.SharedPreferences

class RegisterPresenter(
        private val view: RegisterContract.View,
        private val context: Context,
        private val sharePref: SharedPreferences
) : RegisterContract.Presenter {
    
    override fun register() {
    
    }
}