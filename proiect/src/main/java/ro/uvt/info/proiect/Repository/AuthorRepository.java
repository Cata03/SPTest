package ro.uvt.info.proiect.Repository;
import ro.uvt.info.proiect.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
