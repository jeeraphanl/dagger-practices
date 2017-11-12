package com.nsb.sampledagger.dagger.modules

import android.content.Context
import android.content.SharedPreferences
import com.nsb.sampledagger.dagger.scopes.UserScope
import com.nsb.sampledagger.presentations.mvp.login.LoginActivity
import com.nsb.sampledagger.presentations.mvp.login.LoginContract
import com.nsb.sampledagger.presentations.mvp.login.LoginPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class LoginModule {
    
    @Provides
    @UserScope
    fun provideLoginActivity() : LoginContract.View = LoginActivity()
    
    @Provides
    @UserScope
    fun provideLoginPresenter(view: LoginContract.View, context: Context,
                              @Named("FirstSharedPref") sharedPref: SharedPreferences): LoginPresenter {
        return LoginPresenter(view, context, sharedPref)
    }
}