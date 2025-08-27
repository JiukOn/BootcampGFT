package Ex2;

public class Moto extends Veiculo {
    private final int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {

        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

  
    @Override
    public void exibirInfo() {
        System.out.print("Moto: ");
        super.exibirInfo();
        System.out.println(", " + this.cilindradas + " cc.");
    }
}
