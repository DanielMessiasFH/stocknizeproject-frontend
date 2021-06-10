package br.com.stocknize.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_produto : Button = findViewById(R.id.btn_produto)

        //transição para tela de cadastro de produto
        btn_produto.setOnClickListener {
            Toast.makeText(this,"Produto Cadastrado com Sucesso", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Cad_prodActivity::class.java ))
        }
    }

}