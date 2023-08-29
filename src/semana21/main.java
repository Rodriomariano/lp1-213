package semana21;

// interface = contrato
// conjunto de métodos (somente assinatura, sem corpo)
// classe concreta que IMPLEMENTA a interface

// abstract classe FiguraGeometrica

// Quadrado - lado - calcular Area/Perimetro
// Retangulo - base, altura - CalcularArea/Perimetro

public class main {
    public static void main(String[] args) {
        System.out.println("main...");

        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        tela.addQuadardo(q1);
        tela.addQuadardo(q2);

        System.out.println(tela.areaTotal());

    }
}
