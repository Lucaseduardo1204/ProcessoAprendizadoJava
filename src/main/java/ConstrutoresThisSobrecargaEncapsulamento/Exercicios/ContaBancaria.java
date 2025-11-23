package ConstrutoresThisSobrecargaEncapsulamento.Exercicios;

public class ContaBancaria {
    private static final double  TAXA_DE_SAQUE = 5;
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroDaConta, String nomeTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numeroDaConta, String nomeTitular, double valor){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        Depositar(valor);
    }

    public int getNumeroConta(){
        return  numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(){
        return  saldo;
    }

    public void Depositar(double valor){
        this.saldo += valor;
    }

    public void Sacar(double valor){
        this.saldo -= (valor + TAXA_DE_SAQUE);
    }

    public String toString(){
        return "Numero da conta : " + getNumeroConta() + "\nNome Titular: " + getNomeTitular() + "\nSaldo: " + getSaldo();
    }

}


