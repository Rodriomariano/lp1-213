package semana14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TesteQuadrado {
    @Test
    public void retornaLado(){
        Quadrado quadrado = new Quadrado(5);

        quadrado.setLado(30);

        assertEquals(quadrado.getLado(), 30);
    }

    @Test
    public void ladoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Quadrado quadrado = new Quadrado(5);
           
            quadrado.setLado(-5);
        });
    }

    @Test
    public void ladoNulo(){
        assertThrows(IllegalArgumentException.class, () ->{
            Quadrado quadrado = new quadrado(5);

            quadrado.setLado(0);
        })
    }
}
