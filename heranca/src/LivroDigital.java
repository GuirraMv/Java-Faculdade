public class LivroDigital extends Livro {
    public String linkDownload;
    public int tamanhoMB;

    //Tamanho do arquivo por página
    public float tamanhoPorPagina() {
        return ((float) tamanhoMB /(float)paginas);
    }

    //Calculo do imposto de 20% + R$ 2 por livro
    public float imposto() {
        return (0.2f * this.lucro() + 2);
    }
}
