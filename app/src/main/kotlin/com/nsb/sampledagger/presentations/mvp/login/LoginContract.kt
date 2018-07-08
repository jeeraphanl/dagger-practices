package com.nsb.sampledagger.presentations.mvp.login

interface LoginContract {
    
    interface View {
        
        fun initDagger()
        
        fun showUserName()
    }
    
    interface Presenter {
    
        fun saveUserName()
    }
}