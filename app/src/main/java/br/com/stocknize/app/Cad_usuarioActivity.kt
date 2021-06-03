package br.com.stocknize.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.stocknize.app.model.Usuario
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_cad_usuario.*
import kotlinx.android.synthetic.main.activity_login.*



class Cad_usuarioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_usuario)

        btn_userup.setOnClickListener {

            //criando objeto usuario
            val usuario = Usuario()
            usuario.name = name_user.text.toString()
            usuario.cpf = cpf_user.text.toString()
            usuario.company = company_user.text.toString()
            usuario.login = login_user.text.toString()
            usuario.password = pwd_user.text.toString()

            //Convertendo o objeto usuario em json para enviar a httphelper
            val gson = Gson()
            val usuarioJson = gson.toJson(usuario)

            println("######################" + usuarioJson)

        }


        btn_voltarLogin.setOnClickListener {

            val voltarLogin = Intent(this,LoginActivity::class.java )
            startActivity(voltarLogin)
        }

    }

}