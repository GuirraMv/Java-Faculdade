class Base {
    int x;
    Base(){
        System.out.println("Construtor Base");
    }
    Base(int x){
        this.x = x;
    }
}

class Derivada extends Base {
    int y;

    Derivada(){
        System.out.println("Construtor Derivada");
    }

    Derivada(int x, int y){
        super(x);
        this.y = y;
    }

    void exibir(){
        System.out.println("x = "+x+", y = "+y);
    }
}

public class Teste {
    public static void main(String[] args) {
        Derivada obj1 = new Derivada();
        Derivada obj2 = new Derivada(10,50);
        obj1.exibir();
        obj2.exibir();
    }
}
