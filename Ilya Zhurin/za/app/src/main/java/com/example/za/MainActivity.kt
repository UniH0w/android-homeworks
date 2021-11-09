package com.example.za

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.za.databinding.ActivityMainBinding
import  com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val validatorEror = Validator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MainSignButton.setOnClickListener {
            val email = binding.enterEmail.text.toString()
            val password = binding.confirmPassword.text.toString()


            if (validatorEror.email_all(email) && validatorEror.enterPassword_regestration(password) == true){
                val intent = Intent(this,ProfileActivity::class.java)
                intent.putExtra("name",email)
                startActivity(intent)
            }
            else {
                if (validatorEror.email_all(email) == false) {

                    binding.enterEmail.error = "Введена не коректная почта"}
                    if (validatorEror.enterPassword_regestration(password) == false) {

                        binding.confirmPassword.error = "Вы ввели не коректный пароль"
                    }
                }
            }
        binding.mainTextSingnUp.setOnClickListener{
            val intent = Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }


    }


    }


















