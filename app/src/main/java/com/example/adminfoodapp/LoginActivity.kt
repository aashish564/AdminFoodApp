package com.example.adminfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adminfoodapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding : ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener{
            val intent  = Intent(this,Sign_inActivity::class.java)
            startActivity(intent)
        }
        binding.donthavebutton.setOnClickListener{
            val intent  = Intent(this,Sign_inActivity::class.java)
            startActivity(intent)
        }
    }
}