package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void testarCalcularVolume(){
        //AAA

        //Arrange
        Aquario aquario = new Aquario();
        aquario.comprimento = 20.0;
        aquario.altura = 5.0;
        aquario.largura = 2.0;

        //Act
        double volume = aquario.calcularVolume();

        //Assert
        assertEquals(200.0,volume);
    }
}
