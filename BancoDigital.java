public class BancoDigital {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(500);
        contaPoupanca.depositar(1000);

        contaCorrente.sacar(100);
        contaPoupanca.renderJuros();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.transferir(200, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
   
    
}
class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

abstract class Conta {
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = 1; // agência padrão
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void renderJuros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renderJuros'");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 12.00;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}

class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.02;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }

    public void renderJuros() {
        this.saldo += this.saldo * RENDIMENTO;
    }
}
