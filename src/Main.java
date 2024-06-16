import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Colaborador[] colaboradores = new Colaborador[3];

        // Adição do funcionário
        colaboradores[0] = new Funcionario(01, "Felipe","11 91234-5678", 1500);

        // Adição do Vendedor
        System.out.println("Adicionar Vendedor");
        System.out.print("Identificação (número inteiro): ");
        int id = sc.nextInt();
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Telefone: ");
        String telefone = sc.next();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        System.out.print("Comissão: ");
        double comissao = sc.nextDouble();
        colaboradores[1] = new Vendedor(id, nome, telefone, salario, comissao);

        // Adição do Gerente
        Gerente gerente = new Gerente();
        gerente.setIdentificacao(03);
        gerente.setNome("Leonardo");
        gerente.setTelefone("11 91234-5678");
        gerente.setSalario(2200);
        gerente.setBonus(350);
        colaboradores[2] = gerente;

        for (Colaborador colaborador : colaboradores){
            colaborador.ExibirInformacoes();
        }
    }
}