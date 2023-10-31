package com.example.newbase.domain.useCase

import com.example.newbase.data.repo.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor( private val loginRepository: LoginRepository) {
    fun saveLoginData(user: String) = loginRepository.saveLoginData(user)
    fun getUserData(): String? = loginRepository.getUserData()

}