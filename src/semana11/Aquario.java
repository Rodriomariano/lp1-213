package semana11;

public class Aquario {
    double altura, largura, comprimento;

    public double calcularVolume() {
        return (altura*largura*comprimento);
    }
    
    public double calcularPotenciaTermostato(double temperaturaAmbiente, double temperaturaDesejada) {
        return calcularVolume() * 0.05f * (temperaturaAmbiente - temperaturaDesejada);
    }
    
    public String calcularQuantidadeLitrosFiltro(){
        return "Filtragem mínima: " + calcularFiltragemMinima() + "\n Filtragem Máxima: " + calcularFiltragemMaxima();
    }

    public double calcularFiltragemMinima() {
        return calcularVolume() * 2;
    }
    
    public double calcularFiltragemMaxima() {
        return calcularVolume() * 3;
    }
}
