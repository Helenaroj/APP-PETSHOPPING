package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            binding=ActivityMainBinding.inflate(layoutInflater)
            val view=binding.root
            setContentView(view)
        binding.Envios.setOnClickListener{
            startActivity(Intent(this,registroenvios::class.java))}
            Toast.makeText(this,"click en el boton envios",Toast.LENGTH_LONG).show()



        setTheme(R.style.Theme_MyApplication)
        Thread.sleep(3000)
        super.onCreate(savedInstanceState)


        }



        }
