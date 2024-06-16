public class Vendedor extends Colaborador {

    private double comissao;

    public double getComissao (){
        return  comissao;
    }

    public void setComissao (double comissao){
        this.comissao = comissao;
    }

    public Vendedor(int identificacao, String nome, String telefone, double salario, double comissao) {
        super(identificacao, nome, telefone, salario);
        this.comissao = comissao;
    }

    @Override
    public void ExibirInformacoes() {
        System.out.println("\nIdentificação: " + getIdentificacao() + "\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nSalário: " + getSalario() + "\nComissão: " + getComissao() + "\nSalário Final: " + CalcularSalario());
    }

    @Override
    public double CalcularSalario() {
        return getSalario() + comissao;
    }
}
