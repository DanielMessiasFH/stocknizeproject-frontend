package br.com.stocknize.app.model

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.stocknize.app.MainActivity
import br.com.stocknize.app.R
import kotlinx.android.synthetic.main.activity_cad_usuario.*
import kotlinx.android.synthetic.main.activity_estoque.*
import kotlinx.android.synthetic.main.activity_main.*

class EstoqueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estoque)

        val btn_voltar: Button = findViewById(R.id.btn_voltar)

       /* btn_estoque.setOnClickListener {
            val estoque = Estoque()
            estoque.nome_produto = nome.text.toString()
            estoque.quantidade_produto = quantidade.toString()
            estoque.preco = preco.toString()

        }*/

        btn_voltar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}