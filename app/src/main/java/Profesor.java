import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Profesor")
public class Profesor {
    public Profesor (){}

    @PrimaryKey
    @NonNull

    private int Id;

    @ColumnInfo(name = "nombre")
    private String mNombre;
    @ColumnInfo (name = "asignatura")
    private String mAsignatura;
    @ColumnInfo (name = "codigoinst")
    private String mCodigoInst;
    @ColumnInfo (name = "telefono")
    private String mTelefono;
    @ColumnInfo (name = "correoinst")
    private String mCorreoInst;

    public String getNombre(){return mNombre}
    public void  setNombre(String nombre){this.mNombre = nombre;}
    public String getAsignatura(){return mAsignatura}
    public void  setAsignatura(String asignatura){this.mAsignatura = asignatura; }
    public int  getCodigoInst{return.mCodigoInst}
    public void  setCodigoInst(String codigoinst){this.mCodigoInst = codigoinst;}
    public int getTelefono{return.mTelefono}
    public void setTelefono(String telefono){this.mTelefono = telefono; }
    public String getmNombre{return.mCorreoInst}
    public void setmCorreoInst(String correoinst){this.mCorreoInst = correoinst;}






}
