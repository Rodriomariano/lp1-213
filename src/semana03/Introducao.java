package semana03;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        // Comentario de uma linha

        /*
         * Comentário de várias 
         * linhas
         */

         // Tipos Primitivos
         // Inteiros
         // byte, short, int, long

         byte n1 = 100; // 1 byte - -128 a 127
         short n2 = 3000; // 2 bytes - -32768 a 32767
         int n3 = 321312321; // 4 bytes - 2 bilhoes
         long n4 = 3232323232L; // 8 bytes

         // Ponto flutuante
         float nota1 = 10.3446f;
         double nota2 = 10.944964;

         // char 
         char letra = 'A';

         // boolean
         boolean ligado = true;
         boolean teste = false;

         // String
         String nome = "Rodrigo Mariano Ferreira";
         System.out.println(nome);
         System.out.println(nome.toLowerCase());
         System.out.println(nome.toUpperCase());

         // variáveis e constantes
         int idade = 20;
         int idade2;
         idade2 = 30;

         // Java 10 - inferência de tipo com var
         var idade3 = 15;
         var nome2 = "maria";

         // constantes - keyword final 
         final double TESTE = 20.2;
         final double pi = 3.14;

         // Entrada e saída de dados
         
         // Entrada - Classes Scanner 
         // Saída - System.out

         Scanner sc = new Scanner(System.in);
         

         System.out.println("entre com o seu nome");
         String nomeInformado = sc.nextLine(); 

         System.out.println("entre com a sua idade");
         int idadeInformada = sc.nextInt(); 

         System.out.println(nomeInformado + " " + idadeInformada);
         System.out.printf("%s %d \n", nomeInformado, idadeInformada);
 
         sc.close();


      

    }
}
