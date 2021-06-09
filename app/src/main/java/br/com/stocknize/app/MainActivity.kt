package br.com.stocknize.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val client = HttpClient(CIO)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val button = findViewById<Button>(R.id.btn_estoque)

        button.setOnClickListener{
            val intent = Intent(applicationContext, Estoque::class.java)
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        lifecycleScope.launch {
            val response: HttpResponse = client.get("https://192.168.0.1:44395")
            println(response.status)
        }

        setContentView(R.layout.activity_main)


    }

}