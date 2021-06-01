package br.com.stocknize.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    public fun Login() {
        var username = user.getText().toString()
        var pass = password_user.getText().toString()

        if(username.equals("") || pass.equals("")){
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
        }else if (username.equals("severino") && pass.equals("123")){
            Toast.makeText(this,"Login realizado com Sucesso", Toast.LENGTH_SHORT).show()
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

        btn_sair.setOnClickListener {
            finish()
        }
    }
}