import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso ArrayList e LinkList
//        ArrayList<String> pessoas = new ArrayList<>();
//        LinkedList<String> pessoas = new LinkedList<>();
//        pessoas.add("Pedro");
//        pessoas.add("Maria");
//        pessoas.add("João");
//
//        System.out.println(pessoas);
//        System.out.println(pessoas.get(0));
//        pessoas.remove(1);
//        System.out.println(pessoas);
//
//        pessoas.add("Vitoria");
//
//        System.out.println("normal: " + pessoas);
//
//        Collections.sort(pessoas);
//        System.out.println("ordem alfabetica: " + pessoas);
//
//        Collections.shuffle(pessoas);
//        System.out.println("ordem aleatoria: " + pessoas);
//
//        Collections.reverse(pessoas);
//        System.out.println("ordem reversa: " + pessoas);
//
//        System.out.println("menor elemento: " + Collections.min(pessoas));
//        System.out.println("maior elemento: " + Collections.max(pessoas));
//
//        // Exemplo de uso HashMap
//        HashMap<String, String> capitais = new HashMap<>();
//        capitais.put("Brasil", "Brasilia");
//        capitais.put("Argentina", "Buenos Aires");
//        capitais.put("Paraguai", "Assuncao");
//        capitais.put("Uruguai", "Montevideu");
//
//        System.out.println("map capitais: " + capitais);
//        System.out.println("exemplo de get: " + capitais.get("Brasil"));

        // Exemplo de uso HashSet
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Fernanda");
        nomes.add("Matias");
        nomes.add("Caio");
        nomes.add("Catarina");

        nomes.add("Matias"); // Matias já existe e não será adicionado

        System.out.println("nomes: " + nomes);

        int qtd = nomes.size(); // total de itens

        if (nomes.contains("Matias")) {
            System.out.println("Contém Matias");
        }

        if (nomes.contains("Josias")) {
            System.out.println("Contém Josias");
        } else {
            System.out.println("Não foi achado Josias");
        }
    }
}