package com.nsb.sampledagger.dagger.components

import com.nsb.sampledagger.dagger.modules.LoginModule
import com.nsb.sampledagger.dagger.scopes.UserScope
import com.nsb.sampledagger.presentations.mvp.login.LoginActivity
import dagger.Component

@UserScope
@Component(dependencies =  arrayOf(AppComponent::class), modules = arrayOf(
            LoginModule::class
))

interface LoginComponent {
    fun inject(loginActivity: LoginActivity)
}