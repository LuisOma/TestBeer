package com.example.newbase.data.dataSource.local.sharedPrefs

import android.content.SharedPreferences
import javax.inject.Inject

class LoginDataSource @Inject constructor(private val sharedPreferences: SharedPreferences) {

    companion object {
        private const val PREF_KEY_USER = "logged_in_user"
    }

    fun saveLoginData(user: String) {
        with(sharedPreferences.edit()) {
            putString(PREF_KEY_USER, user)
            apply()
        }
    }

    fun getUserData(): String? {
        return sharedPreferences.getString(PREF_KEY_USER, null)
    }
}
