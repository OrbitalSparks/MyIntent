package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //definir variables para las entradas y botones
        val txtTitulo = findViewById<TextView>(R.id.txtTitulo)
        txtTitulo.text = "Bienvenido al Sistema"
        val txtusuario = findViewById<EditText>(R.id.textInputIDUsuario)
        val txtpasword = findViewById<EditText>(R.id.txIDPassword)
        val btnPresioname = findViewById<Button>(R.id.button)



        //acciones del boton de ingreso
        btnPresioname.setOnClickListener {
            val txtusuariostring = txtusuario.text.toString().trim()
            val txtpasswordstring = txtpasword.text.toString().trim()

            //Toast.makeText(this,txtusuario.text, Toast.LENGTH_SHORT).show()
            if (txtusuariostring.isEmpty()){
                Toast.makeText(this,"Usuario vacio", Toast.LENGTH_SHORT).show()
                val miIntent = Intent(this, MainActivity2::class.java)

             //   val caja1=CajaAhorro()

               // miIntent.putExtra("",caja1)

                startActivity(miIntent)
            }



            }
    }
}


