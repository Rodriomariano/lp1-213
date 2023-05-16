package semana12;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        //quadrado.lado = 10.0;

        double area = quadrado.calcularArea();
        System.out.println(area);

              //ou

        System.out.println(quadrado.calcularArea());

        double perimetro = quadrado.calcularPerimetro();
        System.out.println(perimetro);
        
              //ou

        System.out.println(quadrado.calcularPerimetro());



        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(20.0, 30.0);
        Retangulo r3 = new Retangulo(15.0);

        System.out.println(r3.base);
        System.out.println(r3.altura);

        System.out.println(r2.base);
        System.out.println(r2.altura);

        System.out.println(r1.base);
        System.out.println(r1.altura);

        Circulo c1 = new Circulo(8.0);
        System.out.println(c1);



    }
}
