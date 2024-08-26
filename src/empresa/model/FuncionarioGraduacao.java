package empresa.model;

import empresa.service.Comissao;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    protected String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia, comissao);
        this.universidade = universidade;

        ((Comissao) comissao).setSalarioBase(8000.00);
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
