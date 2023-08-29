package semana21;

import java.util.ArrayList;

public class Tela {
    private int numeroQuadrados;
    private ArrayList<Quadrado> quadrados;

    public Tela() {
        numeroQuadrados = 0;
        quadrados = new ArrayList<>();
    }

    public void addQuadardo(Quadrado q) {
        quadrados.add(q);
        numeroQuadrados = numeroQuadrados += 1;
    }

    public double areaTotal() {
        double total = 0.0;

        for (Quadrado quadrado : quadrados) {
            total += quadrado.calcularArea();
        }

        return total;
    }

}
