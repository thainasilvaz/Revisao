package com.example.autenticador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNome: TextView = findViewById(R.id.edtNome)
        val txtEndereco: TextView = findViewById(R.id.edtEndereco)
        val txtBairro: TextView = findViewById(R.id.edtBairro)
        val txtCep: TextView = findViewById(R.id.edtCep)
        val txtCidade: TextView = findViewById(R.id.edtCidade)

        val btnCadastrar: TextView = findViewById(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener{
            Toast.makeText(this, "Nome: " + txtNome.text.toString(), Toast.LENGTH_LONG).show()

    }

}
}