
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Estudiante")
public class Estudiante {
    public Estudiante (){}

    @PrimaryKey
    @NonNull

    private int Id;

    @ColumnInfo(name = "nombre")
    private String mNombre;
    @ColumnInfo (name = "grado")
    private int mGrado;
    @ColumnInfo (name = "codigoinst")
    private int mCodigoInst;
    @ColumnInfo (name = "telefono")
    private int mTelefono;
    @ColumnInfo (name = "correoinst")
    private String mCorreoInst;

    public String getNombre(){return mNombre}
    public void  setNombre(String nombre){this.mNombre = nombre;}
    public int getGrado(){return mGrado}
    public void  setGrado(int grado){this.mGrado = grado; }
    public int  getCodigoInst{return.mCodigoInst}
    public void  setCodigoInst(int codigoinst){this.mCodigoInst = codigoinst;}
    public int getTelefono{return.mTelefono}
    public void setTelefono(int telefono){this.mTelefono = telefono; }
    public String getmNombre{return.mCorreoInst}
    public void setmCorreoInst(String correoinst){this.mCorreoInst = correoinst;}

}
