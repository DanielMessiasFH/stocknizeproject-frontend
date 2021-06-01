package br.com.stocknize.app.db

class ProdutoRepository(private val dao: ProdutoDAO) {

    val produtos = dao.getAllProduto()

    suspend fun insert (produto: Produto): Long {
        return dao.insertProduto(produto)
    }

    suspend fun update(produto: Produto): Int {
        return dao.updatetProduto(produto)
    }

    suspend fun delete(produto: Produto): Int {
        return dao.deleteProduto(produto)
    }
    suspend fun deleteAll():Int {
        return dao.deleteAll()
    }
}