package br.com.stocknize.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    fun Login() {
        var username = user.getText().toString()
        var pass = password_user.getText().toString()

        if(username.equals("") || pass.equals("")){
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
        }else if (username.equals("severino") && pass.equals("123")){
            Toast.makeText(this,"Login realizado com Sucesso", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity::class.java ))
        }else{
            Toast.makeText(this,"Usuário ou Senha incorretos", Toast.LENGTH_SHORT).show()
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            Login()
        }

        //sair do aplicativo pela tela de login
        btn_sair.setOnClickListener {
            finish()
        }

        //transição para tela de cadastro de usuário
        btn_caduser.setOnClickListener {
            val abrirCadastroUser = Intent(this,Cad_usuarioActivity::class.java )
            startActivity(abrirCadastroUser)
        }
    }
}