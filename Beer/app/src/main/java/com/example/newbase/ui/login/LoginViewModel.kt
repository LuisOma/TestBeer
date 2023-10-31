package com.example.newbase.ui.login

import androidx.lifecycle.ViewModel
import com.example.newbase.domain.useCase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
   private val loginUseCase: LoginUseCase
): ViewModel() {

    fun saveLoginData(user: String){
        loginUseCase.saveLoginData(user)
    }

    fun getUserData(): String? = loginUseCase.getUserData()

}