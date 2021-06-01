package br.com.stocknize.app.db;

import androidx.lifecycle.LiveData
import androidx.room.*




@Dao

public interface ProdutoDAO {
@Insert
suspend fun insertProduto(produto:Produto): Long

    @Update
    suspend fun updatetProduto(produto:Produto) : Int

    @Delete
    suspend fun deleteProduto(produto:Produto) : Int

    @Query ("DELETE FROM Produto_data_table")
    suspend fun deleteAll() : Int

    @Query ("SELECT * FROM Produto_data_table")
    fun getAllProduto():LiveData<List<Produto>>








}
