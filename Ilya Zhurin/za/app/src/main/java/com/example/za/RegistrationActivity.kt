package com.example.za

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.za.databinding.ActivityRegistrationBinding
import  com.google.android.material.button.MaterialButton

class RegistrationActivity : AppCompatActivity() {
    val validatorEror = Validator()
    lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.RegisterButton.setOnClickListener {
            val email = binding.registerEnterEmail.text.toString()
            val password = binding.registerPasswrord.text.toString()
            val name = binding.registrName.text.toString()


            if (validatorEror.email_all(email) && validatorEror.enterPassword_regestration(password) == true){
                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("Name",name)
                startActivity(intent)
            }
            else {
                if (validatorEror.email_all(email) == false) {

                    binding.registerEnterEmail.error = "Введена не коректная почта"}
                if (validatorEror.enterPassword_regestration(password) == false) {
                    binding.registerPasswrord.error = "Вы ввели не коректный пароль"
                }
                }
            }


        }

    }
