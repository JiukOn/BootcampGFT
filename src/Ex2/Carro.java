package Ex2;

public class Carro extends Veiculo {
    private final int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        System.out.print("Carro: ");
        super.exibirInfo();
        System.out.println(", " + this.portas + " portas.");
    }
}
