package com.example.adminfoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.adminfoodapp.databinding.ActivitySignInBinding

class Sign_inActivity : AppCompatActivity() {
    private val binding: ActivitySignInBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.createButton.setOnClickListener{
            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.alreadyhavebutton.setOnClickListener{
            val intent  = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        val locationList = arrayOf("Pilkhuwa","Hapur","Ghaziabad","Vasundra","ABES","Indrapuram")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)


    }
}