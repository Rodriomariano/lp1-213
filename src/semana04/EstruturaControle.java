package semana04;

public class EstruturaControle {
   public static void main(String[] args) {
       // if

       int idade = 17;
       final int MAIORIDADE = 18;

       if (idade >= MAIORIDADE) {
           System.out.println("maior de idade");
       }

       // if/else
       boolean ligado = true;
       if (ligado) {
           System.out.println("sensor ligado!");
       } else {
            System.out.println("sensor desligado!");
       }

       // switch
       // char, byte, short, int
       // String
       // enum
       int x = 3;
       switch (x) {
        case 1:
            System.out.println("Número 1");
            break;
        case 2:
            System.out.println("Número 2");
            break;
        case 3:
            System.out.println("Número 3");
            break;
        default:
            System.out.println("Número não identificado");
            break;
       }
       
       // while, do while, for, foreach

       int contador = 0;
       while (contador < 3) {
           System.out.println("Ligado!");
           contador++;
       }

       contador = 0;
       do {
          System.out.println("Liagdo!");
          contador++;
       } while (contador < 3);

       for (int i = 0; i < 3; i++) {
            System.out.println("Ligado! fori"); 
       }

       // Arrays
       // Vários elementos em uma mesma variavel
       // acesso os dados com número inteiro
       // a primeira posição começa 0
       // notas = [_____, _____, _____]
                     0      1      2
       // 3 notas 
       double n1 = 10.0;
       double n2 = 5.5;
       double n3 = 7.4; 

       double[] notas = new double[3];
       notas[0] = 10,0;
       notas[1] = 5.5;
       notas[2] = 7.4;

       System.out.println(notas[1]);
       System.out.println(notas[2]);
       System.out.println(notas[3]);

       for (int j = 0; i < notas.length; j++) {
            System.out.println(notas[i]);
       }
        
       // foreach
       for (double nota : notas) {
            System.out.println(nota);
       }


   }   

}
