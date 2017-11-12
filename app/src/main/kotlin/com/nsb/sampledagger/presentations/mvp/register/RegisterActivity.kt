package com.nsb.sampledagger.presentations.mvp.register

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nsb.sampledagger.SampleApplication
import com.nsb.sampledagger.dagger.components.DaggerPresenterComponent
import com.nsb.sampledagger.dagger.components.PresenterComponent
import com.nsb.sampledagger.dagger.modules.PresenterModule
import javax.inject.Inject

class RegisterActivity : AppCompatActivity(), RegisterContract.View {
    
    private lateinit var presenterComponent: PresenterComponent
    
    @Inject lateinit var presenter: RegisterPresenter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    
        initDagger()
        
        presenter.register()
    }
    
    override fun initDagger() {
    
        presenterComponent = DaggerPresenterComponent
                .builder()
                .appComponent(SampleApplication.appComponent)
                .presenterModule(PresenterModule(this))
                .build()
    
        presenterComponent.inject(this)
    }
    
    override fun showRegisterSuccess() {
    
    }
}