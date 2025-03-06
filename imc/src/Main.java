package imc;

import java.util.Scanner;

public class Main {
    static void calculatorImc() {
        Double peso;
        Double altura;
        Double imc;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        peso = teclado.nextDouble();
        System.out.println("Digite o altura: ");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Seu imc é: %.2f", imc);
    }
    public static void main(String[] args) {
        calculatorImc();
    }
}