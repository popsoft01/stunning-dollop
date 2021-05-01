package TestPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DonateMovieTest {
    
    @Test
            void canDonateMovies(){
        Library library = new Library();

        Movies movies = new Movies();
        library.donate(movies);
        assertTrue(library.getCatalogue().contains(movies));
}
}
