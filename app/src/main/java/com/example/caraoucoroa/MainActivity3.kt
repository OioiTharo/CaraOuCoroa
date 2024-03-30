package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val Jogada = findViewById<TextView>(R.id.idJogada)
        val situacao = findViewById<TextView>(R.id.idSituacao)
        var faceMaquina = "";
        val jogarNovamente = findViewById<Button>(R.id.btnJogarNovamente)

        val jogadaDoUsuario = intent.getStringExtra("jogada")

        Jogada.text = jogadaDoUsuario ?: "sem preenchimento"

        var jogadaMaquina = (0..1).random()

        if(jogadaMaquina < 0.5) {
            faceMaquina = "cara"
        }else{
            faceMaquina = "coroa"
        }
        if(jogadaDoUsuario.toString().equals(faceMaquina)){
            situacao.text=":) VOCÊ GANHOU!"
        }else{
            situacao.text=":( VOCÊ PERDEU!"
        }
        jogarNovamente.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("reiniciar", true)
            startActivity(intent)
        }
    }
}