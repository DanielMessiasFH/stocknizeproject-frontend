package br.com.stocknize.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.launch

class Estoque : AppCompatActivity() {
    private val client = HttpClient(CIO)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            val response: HttpResponse = client.get("https://ktor.io/")
            println(response.status)
            client.close()
        }
        setContentView(R.layout.activity_estoque)
    }
}