package empresa.service;

public class Supervisor extends Comissao {
    private static final double COMISSAO_SUPERVISOR = 600.00;

    public Supervisor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularValorTotal() {
        return salarioBase + COMISSAO_SUPERVISOR;
    }

    @Override
    public String toString() {
        return "Supervisor - " + super.toString();
    }
}
