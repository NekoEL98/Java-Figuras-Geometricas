public class Trapecio {
    private int baseMayor;
    private int baseMenor;
    private int altura;
    private int lado;

    public Trapecio(int baseMayor, int baseMenor, int altura, int lado) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado = lado;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + 2 * lado;
    }
}

