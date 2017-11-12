package com.nsb.sampledagger.presentations.mvp.login

import android.content.SharedPreferences
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test

class LoginPresenterTest {
    
    private lateinit var view: LoginContract.View
    private lateinit var sharePref: SharedPreferences
    private lateinit var presenter: LoginPresenter
    
    @Before
    fun setUp() {
        view = mock()
        sharePref = mock()
        presenter = LoginPresenter(view, sharePref)
    }
    
    @Test
    fun save_username() {
        presenter.saveUserName()
        verify(view).showUserName()
    }
}