package design;
import java.util.ArrayList;
import java.util.List;
import design.books;

public class booksModel {

    public List<books> findAll() {
        List<books> boook = new ArrayList<books>();
        boook.add(new books("Amor a 4 estaciones", 2018, 300));
        boook.add(new books("Harry Potter y la cámara de los secretos", 2009, 500));
        boook.add(new books("YOU", 2015, 200));
        return boook;
    }

}
