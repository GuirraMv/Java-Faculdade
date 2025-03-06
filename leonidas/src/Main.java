import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner telcado = new Scanner(System.in);
        int valorCorreto = 10000;
        String mensagem;

        System.out.println("Digite o seu palpite: ");
        int palpite = telcado.nextInt();

        while(palpite != valorCorreto){
            mensagem = palpite > valorCorreto ? "Um pouco menos" : "Um pouco mais";
            System.out.println(mensagem);
            
            System.out.println("Digite outro palpite: ");
            palpite = telcado.nextInt();
        }
        System.out.println("Acertou!");
    }
}