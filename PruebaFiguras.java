// Nombre del estudiante: Elizabeth López Fonseca
// Fecha: 06/12/2025
// Descripción: 

public class PruebaFiguras {

    public static void main(String args[]) {
        
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Trapecio figura5 = new Trapecio(10, 6, 4, 5);
        
        System.out.println("===== CIRCULO =====");
        System.out.println("Area del circulo = " + figura1.calcularArea());
        System.out.println("Perimetro del circulo = " + figura1.calcularPerimetro());
        System.out.println();

        System.out.println("===== RECTANGULO =====");
        System.out.println("Area del rectangulo = " + figura2.calcularArea());
        System.out.println("Perimetro del rectangulo = " + figura2.calcularPerimetro());
        System.out.println();

        System.out.println("===== CUADRADO =====");
        System.out.println("Area del cuadrado = " + figura3.calcularArea());
        System.out.println("Perimetro del cuadrado = " + figura3.calcularPerimetro());
        System.out.println();

        System.out.println("===== TRIANGULO RECTANGULO =====");
        System.out.println("Area del triangulo rectangulo = " + figura4.calcularArea());
        System.out.println("Perimetro del triangulo rectangulo = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println();

        System.out.println("===== TRAPECIO =====");
        System.out.println("Area del trapecio = " + figura5.calcularArea());
        System.out.println("Perimetro del trapecio = " + figura5.calcularPerimetro());
    }
}
