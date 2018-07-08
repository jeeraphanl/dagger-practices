package com.nsb.sampledagger.dagger.modules

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.nsb.sampledagger.dagger.scopes.UserScope
import com.nsb.sampledagger.presentations.mvp.login.LoginActivity
import com.nsb.sampledagger.presentations.mvp.login.LoginPresenter
import com.nsb.sampledagger.presentations.mvp.register.RegisterActivity
import com.nsb.sampledagger.presentations.mvp.register.RegisterPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class PresenterModule(private val activity: Activity) {
    
    @Provides
    @UserScope
    fun provideLoginActivity() = activity as LoginActivity
    
    @Provides
    @UserScope
    fun provideRegisterActivity() = activity as RegisterActivity
    
    @Provides
    @UserScope
    fun provideLoginPresenter(activity: LoginActivity,
                              @Named("FirstSharedPref") sharedPref: SharedPreferences
    ): LoginPresenter {
        return LoginPresenter(activity, sharedPref)
    }
    
    @Provides
    @UserScope
    fun provideRegisterPresenter(activity: RegisterActivity,
                              context: Context,
                              @Named("FirstSharedPref") sharedPref: SharedPreferences
    ): RegisterPresenter {
        return RegisterPresenter(activity, context, sharedPref)
    }
}