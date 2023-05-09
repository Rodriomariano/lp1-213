package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class PessoaTest {
    
   @Test
   public void encontraUmImcBaixoPeso() {
    //AAA
    //Arrange
    float altura = 2.10f;
    float peso = 50.0f;

    Pessoa pessoa = new Pessoa();
    pessoa.altura = altura;
    pessoa.peso = peso;
    int classificacao = pessoa.getFaixa();
    
    //Assert
    assertEquals(0, classificacao);
}
}
