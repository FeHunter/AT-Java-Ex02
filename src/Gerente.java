public class Gerente extends Colaborador {

    private double bonus;

    public double getBonus (){
        return  bonus;
    }

    public void setBonus (double bonus){
        this.bonus = bonus;
    }

    public Gerente () { }
    public Gerente(int identificacao, String nome, String telefone, double salario, double bonus) {
        super(identificacao, nome, telefone, salario);
        this.bonus = bonus;
    }

    @Override
    public void ExibirInformacoes() {
        System.out.println("\nIdentificação: " + getIdentificacao() + "\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nSalário: " + getSalario() + "\nComissão: " + getBonus() + "\nSalário Final: " + CalcularSalario());
    }

    @Override
    public double CalcularSalario() {
        return getSalario() + bonus;
    }
}
