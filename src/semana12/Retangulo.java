package semana12;


public class Retangulo {
    
    //Atributos
    public double base;
    public double altura;
    
    //Construtor
    public Retangulo(double base, double altura) {
        if( base <= 0.0) {
            throw new IllegalAccessError("Base invalida");
        }

        if( altura <= 0.0) {
            throw new IllegalAccessError("Altura invalida");
        }
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double valor) {
        this(valor, valor);
        //this.base = valor;
        //this.altura = valor;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
