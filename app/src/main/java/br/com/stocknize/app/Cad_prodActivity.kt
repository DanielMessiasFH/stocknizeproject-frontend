package br.com.stocknize.app


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Cad_prodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_prod)

        val btn_cad_prod : Button = findViewById(R.id.btn_cad_prod)

        btn_cad_prod.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java ))
        }
    }
}