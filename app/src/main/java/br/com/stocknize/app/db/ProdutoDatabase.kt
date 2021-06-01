package br.com.stocknize.app.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Produto::class], version = 1)
abstract class ProdutoDatabase : RoomDatabase(){
    abstract val produtoDAO : ProdutoDAO
    companion object{
        @Volatile
        private var INSTANCE : ProdutoDatabase? = null
        fun getInstance(context: Context ) : ProdutoDatabase{
            synchronized(this){
                var instance:ProdutoDatabase? = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ProdutoDatabase::class.java,
                        "Produto_data_table"
                    ).build()
                }
                return instance
            }
        }
    }
}
