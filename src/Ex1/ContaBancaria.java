package Ex1;

//Tema: Sistema bancário simples
//Crie uma classe ContaBancaria que tenha os atributos privados: numeroConta, titular, saldo.
//Ela deve expor apenas métodos públicos para:
//• Depositar(valor) (adiciona saldo)
//• Sacar(valor) (diminui saldo se houver saldo suficiente)
//• ExibirSaldo() (mostra saldo atual no console).
//Não permita que o saldo seja alterado diretamente de fora da classe.
//Exemplo de saída no console:
//ruby
//CopiarEditar
//Conta criada para Maria.
//Depositando R$ 1000.
//Sacando R$ 500.
//Saldo atual: R$ 500.


public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        System.out.println("Conta criada para " + this.titular + ".");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depositando R$ " + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Sacando R$ " + valor);
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + this.saldo);
    }
}

