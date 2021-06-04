package br.com.stocknize.app.http

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody

class HttpHelper {

    fun post (json: String) : String {

        //Definir URL do servidor
        val URL = "http://10.0.0.8:44395/api/users"

        //Definir o cabeçalho para o application/jason content type para o body
        val headerHttp = MediaType.parse("application/json; charset=utf-8")

        //Criar um cliente para disparar a requisição
        val client = OkHttpClient()

        //Criar o body da requisição
        val body = RequestBody.create(headerHttp, json)

        //Construtor de Requisição POST http para o servidor
        var requestpost = Request.Builder().url(URL).post(body).build()

        //Chamando a requisição pelo client e recebendo resposta
        val responsepost = client.newCall(requestpost).execute()

        return responsepost.body().toString()
    }
}