public class Funcionario extends Colaborador{
    public Funcionario(int identificacao, String nome, String telefone, double salario) {
        super(identificacao, nome, telefone, salario);
    }

    @Override
    public void ExibirInformacoes() {
        System.out.println("Identificação: " + getIdentificacao() + "\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nSalário: " + getSalario());
    }
}
