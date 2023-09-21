public abstract class Veiculo {
    String Marca;
    String Modelo;
    int ano;

    double calcularCustoViagem(int distancia, String Veiculo) {
        if (Veiculo == "carro") {
            double custo = distancia * 0.20;
            System.out.println("O custo da viagem foi de" + custo);
            return custo;
        } else {
            double custo = distancia * 0.15;
            System.out.println("O custo da viagem foi de" + custo);
            return custo;
        }

    }
}