package com.example.za

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.za.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val receivedText = intent.extras?.getString("name","Hello")
        binding.profileText.text = receivedText
    }
}
