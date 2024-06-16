public class Funcionario extends Colaborador{

    public Funcionario () { }
    public Funcionario(int identificacao, String nome, String telefone, double salario) {
        super(identificacao, nome, telefone, salario);
    }

    @Override
    public void ExibirInformacoes() {
        System.out.println("\nIdentificação: " + getIdentificacao() + "\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nSalário: " + getSalario() + "\nSalário Final: " + CalcularSalario());
    }

    @Override
    public double CalcularSalario() {
        return getSalario();
    }
}
