package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivityRegistroclientesBinding
import com.example.myapplication.databinding.ActivityUsuariohomeBinding

class registroclientes : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroclientesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityRegistroclientesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registroclientes)
    binding.Registrese2.setOnClickListener{ startActivity(Intent(this,ActivityUsuariohomeBinding::class.java))}
    binding.return2.setOnClickListener{startActivity(Intent(this,ActivityMainBinding::class.java))}
    }
}