import org.iesfm.ismaparras.library.Book;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class libraryTests {
    private List<Book> createTestBooks() {
        List<Book> books = new LinkedList<>();
        books.add(
                new Book(
                        "123",
                        "El señor de los anillos",
                        "Tolkien",
                        Set.of("Novela", "Fantasía"
                        )
                )
        );

        books.add(
                new Book(
                        "1234",
                        "Cien años de soledad",
                        "García Márquez",
                        Set.of("Novela", "Realismo mágico")
                )
        );

        books.add(
                new Book(
                        "12345",
                        "El hobbit",
                        "Tolkien",
                        Set.of("Novela", "Fantasía")
                )
        );
        return books;
    }

    @Test
    
}
