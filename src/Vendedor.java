public class Vendedor extends Colaborador {

    private double comissao;

    public Vendedor(int identificacao, String nome, String telefone, double salario, double comissao) {
        super(identificacao, nome, telefone, salario);
        this.comissao = comissao;
    }
}
