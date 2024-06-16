public class Main {
    public static void main(String[] args) {

        Colaborador[] colaboradores = new Colaborador[3];

        colaboradores[0] = new Funcionario(01, "Felipe","11 91234-5678", 1500);
        colaboradores[1] = new Vendedor(02, "Pedro","11 91234-5678", 1700, 500);
        colaboradores[2] = new Gerente(03, "Leonardo","11 91234-5678", 2200, 340);

        for (Colaborador colaborador : colaboradores){
            colaborador.ExibirInformacoes();
        }
    }
}