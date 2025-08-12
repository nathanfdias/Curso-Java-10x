package model.classes;

import model.enums.TipoConta;
import model.interfaces.Conta;

public abstract class ContaBancaria implements Conta {
    private String nome;
    private Double saldo;
    private TipoConta tipoConta;
    
    public ContaBancaria(String nome, Double saldo, TipoConta tipoConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(){}
    
    public TipoConta getTipConta() {
        return tipoConta;
    }

    public void setConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void ConsultarSaldo(){
        if(saldo > 0){
            System.out.println("Saldo bancario de: " + getSaldo());
        } else if(saldo < 0) {
            System.out.println("Sem saldo na conta");
        }
    }

    public void Depositar(double valor){
        setSaldo(getSaldo() + valor);
        ConsultarSaldo();
    }
}
