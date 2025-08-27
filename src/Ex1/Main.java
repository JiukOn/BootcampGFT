package Ex1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaMaria = new ContaBancaria(123, "Maria");

        contaMaria.depositar(1000);
        contaMaria.sacar(500);

        contaMaria.exibirSaldo();
    }
}
