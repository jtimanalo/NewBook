import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.list;

@Dao
public interface EstudianteDAO {

    @Query("SELECT * FROM estudiante")
    list<Estudiante> getAll();

    @Query("SELECT * FROM estudiante WHERE nombre LIKE:nombreestudiante ORDER BY nombre ASC")
    Estudiante getEstudiante(String nombreestudiante);

    @Insert
    void insertAll(Estudiante...estudiantes);

    @Delete
    void delete(Estudiante estudiante);
}
