package empresa;

import empresa.model.Funcionario;
import empresa.model.FuncionarioEnsinoBasico;
import empresa.model.FuncionarioEnsinoMedio;
import empresa.model.FuncionarioGraduacao;
import empresa.service.Comissao;
import empresa.service.Gerente;
import empresa.service.Supervisor;
import empresa.service.Vendedor;

public class MainEmpresa {
    public static void main(String[] args) {
        Comissao comissaoGerente = new Gerente(8000.00);
        Comissao comissaoSupervisor = new Supervisor(3000.00);
        Comissao comissaoVendedor = new Vendedor(1412.00);

        // New funcionários com diferentes níveis de escolaridade e comissões
        Funcionario f1 = new FuncionarioEnsinoBasico("Ana Silva", 301, "Escola Alvorada", comissaoVendedor);
        Funcionario f2 = new FuncionarioEnsinoBasico("João Oliveira", 302, "Escola Esperança", comissaoVendedor);
        Funcionario f3 = new FuncionarioEnsinoBasico("Maria Santos", 303, "Escola Luz", comissaoVendedor);
        Funcionario f4 = new FuncionarioEnsinoBasico("Pedro Costa", 304, "Escola Jardim", comissaoVendedor);

        Funcionario f5 = new FuncionarioEnsinoMedio("Carla Rodrigues", 305, "Escola Alvorada", "Colégio Estadual", comissaoSupervisor);
        Funcionario f6 = new FuncionarioEnsinoMedio("Lucas Martins", 306, "Escola Esperança", "Colégio Estadual", comissaoSupervisor);
        Funcionario f7 = new FuncionarioEnsinoMedio("Fernanda Lima", 307, "Escola Luz", "Colégio Estadual", comissaoSupervisor);
        Funcionario f8 = new FuncionarioEnsinoMedio("Roberto Almeida", 308, "Escola Jardim", "Colégio Estadual", comissaoGerente);

        Funcionario f9 = new FuncionarioGraduacao("Juliana Ferreira", 309, "Escola Nova", "Colégio Técnico", "Universidade Federal", comissaoGerente);
        Funcionario f10 = new FuncionarioGraduacao("Marcos Pereira", 310, "Escola Luz", "Colégio Técnico", "Universidade Estadual", comissaoGerente);

        Funcionario[] funcionarios = {f1, f2, f3, f4, f5, f6, f7, f8, f9, f10};

        double totalSalario = 0;
        double totalEnsinoBasico = 0;
        double totalEnsinoMedio = 0;
        double totalGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double salarioFinal = funcionario.getSalarioFinal();
            totalSalario += salarioFinal;

            if (funcionario instanceof FuncionarioGraduacao) {
                totalGraduacao += salarioFinal;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                totalEnsinoMedio += salarioFinal;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                totalEnsinoBasico += salarioFinal;
            }
        }

        System.out.println("Resumo de custos com salários:");
        System.out.println("Total com salários: R$ " + String.format("%.2f", totalSalario));
        System.out.println("Total com funcionários de ensino básico: R$ " + String.format("%.2f", totalEnsinoBasico));
        System.out.println("Total com funcionários de ensino médio: R$ " + String.format("%.2f", totalEnsinoMedio));
        System.out.println("Total com funcionários de nível superior: R$ " + String.format("%.2f", totalGraduacao));

        System.out.println("\nDetalhes dos funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
