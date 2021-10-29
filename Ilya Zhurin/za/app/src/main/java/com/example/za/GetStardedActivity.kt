package com.example.za

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.za.databinding.ActivityGetStardedBinding
import com.google.android.material.button.MaterialButton

class GetStardedActivity : AppCompatActivity() {
    lateinit var binding: ActivityGetStardedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStardedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.GetStartedButtion.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}