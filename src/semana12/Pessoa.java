package semana12;

public class Pessoa {
    double altura;
    double peso;
    boolean pesoNormal = false;
    boolean sobrepeso = true;

    final double IMC_IDEAL_MINIMO = 18.5;
    final double IMC_IDEAL_MAXIMO = 24.9;
    final double abaixo_do_peso_ideal = 18.5;
    final double peso_normal = 25.0;
    final double acima_do_peso = 30;
    final double obesidade_1 = 35;
    final double obesidade_2 = 40;
    public static final String[] CLASSIFICACAO = {"Baixo peso", "Peso normal", "Execsso de peso", "Obesidade de Classe 1", "Obesidade de Classe 2", "Obesidade de Classe 3"};

    public Pessoa(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularImc() {
        return  peso / (altura * altura);
    }

    public int getFaixa(){
        double imc = calcularImc();
        if (imc < abaixo_do_peso_ideal) return 0;
        else if (imc < peso_normal) return 1;
        else if (imc < acima_do_peso) return 2;
        else if (imc < obesidade_1) return 3;
        else if (imc < obesidade_2) return 4;
        return 5;
    }

    public String getSituacao() {
        if (calcularImc() < IMC_IDEAL_MINIMO) return "GANHAR";
        else if (calcularImc() > IMC_IDEAL_MAXIMO) return "PERDER";
        return "NORMAL";
    }
    
}
    
    

