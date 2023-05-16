public class Principal {
    
    public static void main(String [] args) {
        
        Circulo circulo = new Circulo();

        circulo.setRaio(10);
        System.out.println("A área do círculo é = " + circulo.calcularArea());

        Triangulo triangulo = new Triangulo();

        triangulo.setBase(4);
        triangulo.setAltura(5);
        System.out.println("A área do triângulo é = " + triangulo.calcularArea());

        Quadrado quadrado = new Quadrado();

        quadrado.setLado(6);
        System.out.println("A área do quadrado é = " + quadrado.calcularArea());
    }
}
