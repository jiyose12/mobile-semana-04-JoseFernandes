package com.example.telas

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.telas.classes.Pessoa

class OutraActivity : AppCompatActivity() {
    private lateinit var txtVolta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)
        this.txtVolta = findViewById(R.id.txtOutraResultado)

        val pessoa: Pessoa = intent.getSerializableExtra("MSG_PESSOA") as Pessoa

        this.txtVolta.setText(pessoa.nome + ", você possui " + pessoa.idade() + " anos!")
        this.txtVolta.setOnClickListener({ clickBotao(it) })
    }

    fun clickBotao(view: View){
        val intent = Intent()
        intent.putExtra("MSG_VOLTA", "Funciona mesmo!")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}