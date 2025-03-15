public class Aluno {
    private int matricula;
    public String nome;
    public String cpf;


    public Aluno(int matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void info() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
