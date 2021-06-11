package br.com.stocknize.app.model

class Estoque {
    var nome_produto = ""
    var preco = ""
    var quantidade_produto = ""

    override fun toString(): String {
        return "Usuario(nome_produto='$nome_produto', preco='$preco', quantidade_produto='$quantidade_produto')"
    }
}