package semana05;

import java.util.Scanner;

public class ex02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua altura em metros:");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso em kg:");
        double peso = scanner.nextDouble();
        double imc = peso / (altura*altura);
        System.out.printf("Seu IMC é %.2f\n",imc);

        if (imc <18.5){
            System.out.println("Você está abaixo do peso normal");
            double pesoIdeal = 18.5* (altura*altura);
            double pesoParaGanhar = pesoIdeal - peso;
            System.out.printf("Para chegar ao peso ideal , você precisa ganhar %.2f kg\n",pesoParaGanhar);
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Você está com o peso normal");
        }else if (imc >= 25 && imc < 29.9){
            System.out.println("Você está acima do peso normal");
            double pesoIdeal = 24.9*(altura*altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.println("Para chegar ao peso ideal, você precisa perder" + pesoParaPerder);
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Você está com obesidade");
            double pesoIdeal = 24.9*(altura*altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.printf("Para chegar ao peso normal ");
        
        }else if(imc >= 35 && imc <= 39.9){
            double pesoIdeal = 24.9*(altura*altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.println("Obesidade de Classe 2");
            System.out.println("Para chegar ao peso ideal, você precisa perder" + pesoParaPerder);

        }else if(imc >= 40){
            double pesoIdeal = 24.9*(altura*altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.println("Obesidade de Classe 3");
            System.out.println("Para chegar ao peso ideal, você precisa perder" + pesoParaPerder);

        }
    }
}