public class Livro {
    public String autor;
    public String titulo;
    public float custoProducao;
    public float precoVenda;
    public int paginas;

    public Livro(String autor, String titulo) {
      this.autor = autor;
      this.titulo = titulo;
    };

    public float lucro(){
        return (precoVenda - custoProducao);
    }
    public float imposto() {
        return (0.2f * this.lucro());
    }
    public void imprimirTitulo() {
        System.out.println("Titulo: " + this.titulo);
    }
}
