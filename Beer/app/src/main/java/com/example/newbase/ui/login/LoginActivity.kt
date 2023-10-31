package com.example.newbase.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.newbase.R
import com.example.newbase.databinding.ActivityLoginBinding
import com.example.newbase.databinding.ActivityMainBinding
import com.example.newbase.ui.main.MainActivity
import com.example.newbase.ui.main.beers.BeersViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private val viewModel: LoginViewModel by viewModels()
    private var binding: ActivityLoginBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpViews()

    }

    fun setUpViews(){
        if(!viewModel.getUserData().isNullOrEmpty()){
            binding?.username?.setText(viewModel.getUserData())
        }

        binding?.loginButton?.setOnClickListener {
            if(!binding?.password?.text.isNullOrEmpty()&&!binding?.username?.text.isNullOrEmpty()){
                viewModel.saveLoginData(binding?.username?.text.toString())
                startActivity(Intent(this,MainActivity::class.java))
            }else{
                Toast.makeText(applicationContext,"Ingresa los datos requeridos",Toast.LENGTH_SHORT).show()
            }
        }
    }
}