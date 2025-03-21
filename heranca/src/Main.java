public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Robert Martin","Código Limpo");
        livro1.custoProducao = 9.5f;
        livro1.precoVenda = 19.99f;
        livro1.paginas = 422;

        System.out.println("Autor: " + livro1.autor + "| Custo de producao: " + livro1.custoProducao + "| Preço: " + livro1.precoVenda + "| Quantidade de páginas: " + livro1.paginas + "| titulo: " + livro1.titulo + "\n");

        System.out.println(" O livro " + livro1.titulo + " lucra por venda R$" + livro1.lucro() + " e paga em imposto $" + livro1.imposto());


        LivroDigital livro2 = new LivroDigital("Aditya Bhargava",  "Entendendo algoritmos", "googleLivros");
        livro2.custoProducao= 15.0f;
        livro2.precoVenda= 34.99f;
        livro2.paginas = 422;
        livro2.tamanhoMB=4;

        System.out.println("Autor: " + livro2.autor + "| Custo de producao: " + livro2.custoProducao + "| Preço: " + livro2.precoVenda + "| Quantidade de páginas: " + livro2.paginas + "| titulo: " + livro2.titulo + "\n");

        System.out.println(" O livro " + livro2.titulo + " lucro por venda R$" + livro2.lucro() + " e paga em imposto $" + livro2.imposto());

        System.out.println("O livro " +  livro2.titulo  + " possui tamanho médio de página de " + livro2.tamanhoPorPagina() +" MB\n");

        System.out.println(livro1 instanceof Livro); // true
        System.out.println(livro2 instanceof Livro); // true
        System.out.println(livro1 instanceof LivroDigital); // false
        System.out.println(livro2 instanceof LivroDigital); // true
    }
}