package Ex2;

//Desafio 2 (POO - Herança)
//Tema: Sistema de cadastro de veículos
//Crie uma classe base Veiculo com atributos marca, modelo, ano e método ExibirInfo().
//Depois, crie classes filhas Carro e Moto que herdam de Veiculo e adicionam atributos
//próprios, como portas para Carro e cilindradas para Moto.
//No final, instancie objetos de Carro e Moto e mostre suas informações usando ExibirInfo().
//Exemplo de saída no console:
//yaml
//CopiarEditar
//Carro: Ford Ka, 2020, 4 portas.
//Moto: Yamaha MT-03, 2022, 321 cc.

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Ford", "Ka", 2020, 4);
        Moto minhaMoto = new Moto("Yamaha", "MT-03", 2022, 321);

        meuCarro.exibirInfo();
        minhaMoto.exibirInfo();
    }
}
