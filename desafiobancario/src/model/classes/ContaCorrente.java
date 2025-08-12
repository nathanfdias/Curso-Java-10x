package model.classes;

import model.enums.TipoConta;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String nome, double saldo, TipoConta tipoConta){
        super(nome, saldo, tipoConta);
    }

    @Override
    public void Depositar(double valor){
        setSaldo((getSaldo() + valor)*0.99);
        System.out.println("Valor depositado de: " + valor);
        ConsultarSaldo();
    }
}
