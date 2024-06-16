public class Gerente extends Colaborador {

    private double bonus;

    public Gerente(int identificacao, String nome, String telefone, double salario, double bonus) {
        super(identificacao, nome, telefone, salario);
        this.bonus = bonus;
    }
}
