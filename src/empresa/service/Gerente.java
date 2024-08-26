package empresa.service;

public class Gerente extends Comissao {
    private static final double COMISSAO_GERENTE = 1500.00;

    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularValorTotal() {
        return salarioBase + COMISSAO_GERENTE;
    }

    @Override
    public String toString() {
        return "Gerente - " + super.toString();
    }
}
