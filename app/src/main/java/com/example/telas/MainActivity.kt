package com.example.telas

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.telas.classes.Pessoa

class MainActivity : AppCompatActivity() {
    private lateinit var btVai: Button
    private lateinit var editTextNome: EditText
    private lateinit var editTextAno: EditText
    private lateinit var pessoa: Pessoa
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btVai = findViewById(R.id.btMainVai)
        this.btVai.setOnClickListener({ clickBotao(it) })

        this.editTextNome = findViewById(R.id.txtMainNome)
        this.editTextAno = findViewById(R.id.txtMainAno)
    }

    fun clickBotao(view: View){
        this.pessoa = Pessoa(editTextNome.getText().toString(), Integer.parseInt(editTextAno.getText().toString()))
        val intent = Intent(this, OutraActivity::class.java)
        intent.putExtra("MSG_PESSOA", this.pessoa)
        //startActivity(intent)
        startActivityForResult(intent, 1)
    }

    // é automaticamente executado quando realizada chamada forResult
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK){
            if (requestCode == 1){
                val msg = data?.getStringExtra("MSG_VOLTA")
                Log.i("APP_TELAS", msg.toString())
            }
        }else if (resultCode == Activity.RESULT_CANCELED){
            Log.i("APP_TELAS", "Voltou: " + "Voltou pelo dispositivo")
        }
    }

}