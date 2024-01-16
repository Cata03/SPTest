package ro.uvt.info.proiect.Repository;
import ro.uvt.info.proiect.Entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {
}
