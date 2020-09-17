import androidx.annotation.Entity;
import androidx.annotation.NonNull;

import libro.java.PrimaryKey;

@Entity(tableName = "libro")
public class libro {
    public libro(){

    }
    @PrimaryKey
@NonNull
private int id;


    @ColumnInfo (name = "nombre")
    private String mNombre;
    @ColumnInfo (name = "autor")
    private String mAutor;
    @ColumnInfo (name = "editorial")
    private String mEditorial;
    @ColumnInfo (name = "año")
    private int mAño;
    @ColumnInfo (name = "tema")
    private String mTema;
    @ColumnInfo (name = "paginas")
    private int mNumPaginas;

    public String getNombre(){
        return mNombre;
    }
    public void setNombre(String nombre){
        this.mNombre = nombre;
    }
    public String getAutor(){
        return mAutor;
    }
    public void setAutor(String autor){
        this.mAutor = autor;
    }
    public String getEditorial(){
        return mEditorial;
    }
    public void setEditorial(String editorial){
        this.mEditorial = editorial;
    }
    public int getAño(){
        return mAño;
    }
    public void setmAño(int año){
        this.mAño = año;
    }
    public String getTema(){
        return mTema;
    }
    public void setTema(String tema){
        this.mTema = tema;
    }
    public int getNumPaginas(){
        return mNumPaginas;
    }
    public void setNumPaginas(String numpaginas){
        this.mNumPaginas = numpaginas;
    }
}
