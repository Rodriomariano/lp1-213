package semana10;

// Class - representa um conceito/abstração
// que deve serm implementado no programa
public class Retangulo {
    // Atributos
    public double base;
    public double altura;

    // Métodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

}

