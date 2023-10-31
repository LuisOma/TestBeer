package com.example.newbase.data.repo

import com.example.newbase.data.dataSource.local.sharedPrefs.LoginDataSource
import javax.inject.Inject

class LoginRepository @Inject constructor(private val loginDataSource: LoginDataSource) {
    fun saveLoginData(user:String) = loginDataSource.saveLoginData(user)
    fun getUserData(): String? = loginDataSource.getUserData()
}