package Exercicio_3;
public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido. Verifique o valor ou saldo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }


    public void exibirInfo() {
        System.out.println("----- Dados da Conta -----");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo atual: R$" + saldo);
    }
}