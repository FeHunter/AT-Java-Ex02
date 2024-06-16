public abstract class Colaborador {
    private int identificacao;
    private String nome;
    private String telefone;
    private double salario;

    public Colaborador (int identificacao, String nome, String telefone, double salario){
        this.identificacao = identificacao;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }
}
