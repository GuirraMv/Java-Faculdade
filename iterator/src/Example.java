import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Abacate");
        lista.add("Banana");
        lista.add("Cereja");
        lista.add("Laranja");
        lista.add("Maracuja");
        System.out.println("Os elementos da lista: " + lista);


        Iterator<String> iterator = lista.iterator();
        String str = "";

        while (iterator.hasNext()) {
            str = (String) iterator.next();

            if (str.equals("Cereja")) {
                iterator.remove();
                System.out.println("Cereja removida");
                break;
            }

            System.out.println("Os elementos da lista: ");
            for (String s : lista) {
                System.out.println(s);
            }

        }
    }
}
