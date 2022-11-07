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
            super.onCreate(savedInstanceState)
            setContentView(view)

        binding.Envios.setOnClickListener{
            startActivity(Intent(this,Ingresousuario::class.java))}
            Toast.makeText(this,"click en el boton envios",Toast.LENGTH_LONG).show()
        binding.Nosotros.setOnClickListener{
            startActivity(Intent(this,Nosostros::class.java))}
            Toast.makeText(this,"click en el boton Nosotros",Toast.LENGTH_LONG).show()
        binding.Contactenos.setOnClickListener{
            startActivity(Intent(this,contactenos::class.java))}
            Toast.makeText(this,"click en el boton Contactenos",Toast.LENGTH_LONG).show()

            setTheme(R.style.Theme_MyApplication)
        Thread.sleep(3000)

        }
}
