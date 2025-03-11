class Aritmetica {
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println((Aritmetica.sum(1, 2)));
        System.out.println((Aritmetica.sub(1, 2)));
        System.out.println((Aritmetica.mul(1, 2)));
        System.out.println((Aritmetica.div(1, 2)));
    }
}