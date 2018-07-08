package com.nsb.sampledagger.presentations.mvp.register

interface RegisterContract {
    
    interface View {
        
        fun initDagger()
        
        fun showRegisterSuccess()
    }
    
    interface Presenter {
        
        fun register()
    }
}