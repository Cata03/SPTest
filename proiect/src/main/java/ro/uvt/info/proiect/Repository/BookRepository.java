package ro.uvt.info.proiect.Repository;
import ro.uvt.info.proiect.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
