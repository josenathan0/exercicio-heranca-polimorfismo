package empresa.service;

public class Vendedor extends Comissao {
    private static final double COMISSAO_VENDEDOR = 250.00;

    public Vendedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularValorTotal() {
        return salarioBase + COMISSAO_VENDEDOR;
    }

    @Override
    public String toString() {
        return "Vendedor - " + super.toString();
    }
}
