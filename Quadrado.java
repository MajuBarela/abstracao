public class Quadrado extends Forma {
    
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
