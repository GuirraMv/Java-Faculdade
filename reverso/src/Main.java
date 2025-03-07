import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<String>();

        System.out.printf("Digite a quantidade de nomes: ");
        int quantidade = teclado.nextInt();
        String nome;


        for (int i = 0; i < quantidade; i++) {
            nome = teclado.next();
            listaNomes.add(nome);
        }

        System.out.printf("Ordem normal: ");
        System.out.println(listaNomes);
         Collections.reverse(listaNomes);
        System.out.printf("Ordem reversa: ");
        System.out.println(listaNomes);
    }
}