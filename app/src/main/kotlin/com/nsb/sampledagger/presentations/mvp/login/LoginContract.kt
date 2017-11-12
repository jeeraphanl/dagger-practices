package com.nsb.sampledagger.presentations.mvp.login

interface LoginContract {
    
    interface View {
        
        fun showUserName()
    }
    
    interface Presenter {
    
        fun saveUserName()
    }
}