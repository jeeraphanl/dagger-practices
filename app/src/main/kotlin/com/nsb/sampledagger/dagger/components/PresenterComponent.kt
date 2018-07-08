package com.nsb.sampledagger.dagger.components

import com.nsb.sampledagger.dagger.modules.PresenterModule
import com.nsb.sampledagger.dagger.scopes.UserScope
import com.nsb.sampledagger.presentations.mvp.login.LoginActivity
import com.nsb.sampledagger.presentations.mvp.register.RegisterActivity
import dagger.Component

@UserScope
@Component(
    dependencies =  arrayOf(
        AppComponent::class
),  modules = arrayOf(
        PresenterModule::class
))

interface PresenterComponent {
    fun inject(loginActivity: LoginActivity)
    fun inject(registerActivity: RegisterActivity)
}