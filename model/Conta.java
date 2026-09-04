package model;

public class Conta {

    public int numero;
    public String cliente;
    public double saldo;
    public double limite;


    public Conta() {
    
    }

    public void exibeSaldo() {
        System.out.println(this.saldo);
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void deposita(double valor) {
        saldo = saldo + valor;
    }

    public void saca(double valor) {
        saldo = saldo - valor;
    }
}