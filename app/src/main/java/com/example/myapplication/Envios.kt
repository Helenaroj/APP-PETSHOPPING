package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityIngresousuarioBinding
import com.example.myapplication.databinding.ActivityMainBinding

class Envios : AppCompatActivity() {
    private lateinit var binding: ActivityIngresousuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityIngresousuarioBinding.inflate(layoutInflater)
        val view=binding.root
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresousuario)
    binding.Registrese.setOnClickListener{
        startActivity(Intent(this,registroclientes::class.java))}
        Toast.makeText(this,"click en el boton registrese", Toast.LENGTH_LONG).show()
    binding.Return.setOnClickListener{
        startActivity(Intent(this,MainActivity::class.java))}
    }
}