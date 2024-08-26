package empresa.model;

import empresa.service.Comissao;

public abstract class Funcionario {
    protected String nome;
    protected int codigoFuncional;
    protected Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public double getSalarioFinal() {
        return comissao.calcularValorTotal();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código: " + codigoFuncional + ", Salário Final: R$ " + String.format("%.2f", getSalarioFinal());
    }
}
