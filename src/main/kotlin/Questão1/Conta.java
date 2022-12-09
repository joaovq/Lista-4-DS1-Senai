package Questão1;

public abstract class Conta {
    private String nomeTitular;
    private double saldo;

    private String numConta;

    public Conta(String nomeTitular, double saldo, String numConta) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
}
class ContaCorrente extends Conta{
    public ContaCorrente(String nomeTitular, double saldo, String numConta) {
        super(nomeTitular, saldo, numConta);
    }

}

class ContaPoupanca extends Conta{
    public ContaPoupanca(String nomeTitular, double saldo, String numConta) {
        super(nomeTitular, saldo, numConta);
    }

}

