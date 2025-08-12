package model.classes;

import model.enums.TipoConta;

public class ContaPoupanca extends ContaBancaria {
    
public ContaPoupanca(String nome, double saldo, TipoConta tipoConta){
        super(nome, saldo, tipoConta);
    }

    @Override
    public void Depositar(double valor){
        setSaldo((getSaldo() + valor)*0.98);
        System.out.println("Valor depositado de: " + valor);
        ConsultarSaldo();
    }
}
