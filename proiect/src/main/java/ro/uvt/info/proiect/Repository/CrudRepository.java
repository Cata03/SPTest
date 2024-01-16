package ro.uvt.info.proiect.Repository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrudRepository<T, ID> {
    T save(T entity);

    void delete(T entity);

    T getReferenceById(ID id);

    List<T> findAll();
}
