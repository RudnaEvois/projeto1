/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author a1600052
 */
public class ContaPoupança extends Conta{

    @Override
    public void taxau(double saldo){ //aplica a taxa de acordo com usuario
          double temp;
          saldo*=3;
          temp=saldo/100;
          this.saldo+=(this.saldo*temp);
          
}
}

