public class LivroDigital extends Livro {
    public String linkDownload;
    public int tamanhoMB;

    public LivroDigital(String autor, String titulo, String linkDownload) {
      super(autor, titulo);
      this.linkDownload = linkDownload;
    };

    //Tamanho do arquivo por página
    public float tamanhoPorPagina() {
        return ((float) tamanhoMB /(float)paginas);
    }

    //Calculo do imposto de 20% + R$ 2 por livro
    public float imposto() {
        return super.imposto() + 2;
    }

    // exemplo this e super
    public void imprimirImposto() {
        System.out.println("Imposto Livro físico: " + super.imposto()); //referência a classe base
        System.out.println("Imposto Livro digital: " + this.imposto()); // referência a própria classe
    }
}
