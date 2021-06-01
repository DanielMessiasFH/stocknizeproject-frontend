package br.com.stocknize.app.db
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "Produto_data_table")
data class Produto (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id_prod")
    var id : Int,

    @ColumnInfo(name="nome_prod")
    var name : String,

    @ColumnInfo(name="tipo_prod")
    var tipo : String,

    @ColumnInfo(name="valor_prod")
    var valor : Double
)