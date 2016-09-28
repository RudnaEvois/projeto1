/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author a1600052
 */
public class Conta {

    protected double saldo = 0;

    public double getSaldo() { //mostra o saldo em conta
        return saldo;
    }

    public void deposita(double saldo) { //adiciona saldo em conta
        this.saldo += saldo;
    }

    public void saca(double saldo) { //diminue saldo em conta

        this.saldo -= saldo;

    }

    public void taxau(double saldo) { //aplica a taxa de acordo com usuario
        double temp;
        temp = saldo / 100;
        this.saldo += (this.saldo * temp);

    }

}
