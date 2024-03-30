package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJogar = findViewById<Button>(R.id.btnJogar)
        val escolhaUsuaio = findViewById<EditText>(R.id.inputEscolha)

        btnJogar.setOnClickListener() {
            var CaraouCoroa = escolhaUsuaio.getText().toString()

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("jogada", CaraouCoroa)
            startActivity(intent)
        }
    }
}