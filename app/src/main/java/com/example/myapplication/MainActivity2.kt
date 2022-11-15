package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val validado = findViewById<TextView>(R.id.textvalidado)

        val caja = intent.getParcelableExtra<CajaAhorro>("caja1")
        validado.text=caja?.Titular


      //  val btnVolver = findViewById<Button>(R.id.buttonBack)

      //  btnVolver.setOnClickListener {
      //      val miIntent = Intent(this, MainActivity::class.java)
       //     startActivity(miIntent)
       // }
    }
}//