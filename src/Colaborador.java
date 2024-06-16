public abstract class Colaborador {
    private int identificacao;
    private String nome;
    private String telefone;
    private double salario;

    // Get
    public int getIdentificacao (){
        return  identificacao;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public double getSalario() {
        return salario;
    }

    // Set
    public void setIdentificacao (int identificacao){
        this.identificacao = identificacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Colaborador (int identificacao, String nome, String telefone, double salario){
        this.identificacao = identificacao;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    public abstract void ExibirInformacoes ();
}
