import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface libroDAO {

    @Query("SELECT * FROM libro")
    List<libro> getAll();

    @Query("SELECT * FROM libro WHERE nombre LIKE : nombrelibro ORDER BY nombre ASC")
    libro getLibro(String nombrelibro);

    @Insert
    void insertAll(libro... libros);

    @Delete
    void delete(libro libro);

}
