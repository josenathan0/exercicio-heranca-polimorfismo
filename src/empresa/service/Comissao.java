package empresa.service;

public abstract class Comissao {
    protected double salarioBase;

    public Comissao(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularValorTotal();

    public double obterSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Salário Base: R$ " + String.format("%.2f", salarioBase) + ", Valor Total da Comissão: R$ " + String.format("%.2f", calcularValorTotal());
    }
}
