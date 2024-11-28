import java.util.Collection;
import java.util.ArrayList;

public class MetodoRemove2 {
    public static void main(String[] args) {
         Collection<String> livros = new ArrayList<>();
         livros.add("Java");
         livros.add("PHP");
         livros.add("Python");
         livros.add("SQL");

         System.out.println("Listagem dos livros " + livros);

         livros.clear(); //REMOVE LIVROS 

         System.out.println("Listagem após o clear: " +livros);
    }
}
