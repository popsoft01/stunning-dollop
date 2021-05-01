package TestPractice;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
    private ArrayList<Movies> catelogue = new ArrayList<>();

    public Collection<Movies> getCatalogue() {
        return catelogue;
    }

    public void donate(Movies movies) {
    }
}
