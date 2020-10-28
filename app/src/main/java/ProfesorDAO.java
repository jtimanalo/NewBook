import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;


import java.util.List;
@Dao
public interface ProfesorDAO {

    @Query("SELECT * FROM profesor")
    List<Profesor> getAll();

    @Query("SELECT * FROM profesor WHERE nombre LIKE:nombreprofesor ORDER BY nombre ASC")
    Profesor getProfesor(String nombreprofesor);

    @Insert
    void insertAll(Profesor...profesor);

    @Delete
    void delete(Profesor profesor);

}
