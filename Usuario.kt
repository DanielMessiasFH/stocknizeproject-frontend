package br.com.stocknize.app.model

class Usuario {

    var name = ""
    var cpf = ""
    var login = ""
    var password = ""
    var  company = ""
    override fun toString(): String {
        return "Usuario(name='$name', cpf='$cpf', login='$login', password='$password', company='$company')"
    }


}