import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        HashSet<Integer> conjunto = new HashSet<>();
        HashMap<String, Integer> mapa = new HashMap<>();

        int soma;

        soma = 0; // for simples

        for(int i=0; i < lista.size(); i++) {
            soma += lista.get(i);
        }

        soma = 0; // for each
        for (Integer integer : lista) {
            soma += integer;
        }

        soma = 0; // iterator
        //Iterator it = mapa.entrySet().iterator();
        //Iterator it = conjunto.iterator();

        Iterator it = lista.iterator();

        while (it.hasNext()) {
            soma += (Integer)it.next();
        }

        //Suponha lista como um arrayList com dados de algum tipo, por exemplo interios.
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        ListIterator iterator = lista.listIterator(lista.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}