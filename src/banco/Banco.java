/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author a1600052
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0;

        int escolha2 = 0;
        boolean saquecc = false;
        boolean saquecp = false;

        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupança();

        while (menu == 0) {

            int escolha = 0;
            escolha = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer? \n 1- Acessar Conta Corrente \n 2- Acessar Conta Poupança \n 3- Sair"));

            switch (escolha) {
                case 1:
                    menu = 1;
                    break;
                case 2:
                    menu = 2;
                    break;
                case 3:
                    menu = 10;
                    break;

            }
            while (menu == 1) {

                escolha2 = Integer.parseInt(JOptionPane.showInputDialog("CONTA CORRENTE: \n 1- SALDO \n 2- SACAR \n 3- DEPOSITAR \n 4-VOLTAR \n 5-SAIR"));
                switch (escolha2) {
                    case 1: //saldocc
                        JOptionPane.showMessageDialog(null, cc.getSaldo());
                        break;
                    case 2: //saquecc
                        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
                        double valor = cc.getSaldo();

                        if (valor < saque) {
                            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");

                        } else if (valor > saque) {

                            saquecc = true;
                            cc.saca(saque);

                            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso. \n Você sacou: R$ " + saque);
                            int p = Integer.parseInt(JOptionPane.showInputDialog("Deseja ver o saldo? \n 1- SIM \n 2- NÃO "));
                            if (p == 1) {
                                JOptionPane.showMessageDialog(null, cc.getSaldo());

                            }

                            int q = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra transação? \n 1- SIM \n 2- NÃO "));
                            if (q == 1) {
                                menu = 0;

                            } else {
                                menu = 10;
                            }

                        }
                        break;

                    case 3: //depositocc
                        double dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
                        cc.deposita(dep);
                        JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso. \n Você depositou: R$ " + dep);
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Deseja ver o saldo? \n 1- SIM \n 2- NÃO "));
                        if (p == 1) {
                            JOptionPane.showMessageDialog(null, cc.getSaldo());
                        }
                        int q = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra transação? \n 1- SIM \n 2- NÃO "));
                        if (q == 1) {
                            menu = 0;

                        } else {
                            menu = 10;
                            break;
                        }

                    case 4: //voltar
                        menu = 0;
                        break;
                    case 5: //sair
                        menu = 10;
                        break;
                }

            }

            while (menu == 2) {

                escolha2 = Integer.parseInt(JOptionPane.showInputDialog("CONTA POUPANÇA: \n 1- SALDO \n 2- SACAR \n 3- DEPOSITAR \n 4-VOLTAR \n 5-SAIR"));
                switch (escolha2) {
                    case 1: //saldocp
                        JOptionPane.showMessageDialog(null, cp.getSaldo());
                        break;
                    case 2: //saquecp
                        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
                        double valor = cp.getSaldo();

                        if (valor < saque) {
                            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                        } else {
                            saquecp = true;
                        }
                        if (saquecp == true) {
                            cp.saca(saque);

                            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso. \n Você sacou: R$ " + saque);
                            int p = Integer.parseInt(JOptionPane.showInputDialog("Deseja ver o saldo? \n 1- SIM \n 2- NÃO "));
                            if (p == 1) {
                                JOptionPane.showMessageDialog(null, cp.getSaldo());

                            }

                            int q = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra transação? \n 1- SIM \n 2- NÃO "));
                            if (q == 1) {
                                menu = 0;

                            } else {
                                menu = 10;
                            }

                        }
                        break;
                    case 3: //depositocp
                        double dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
                        cp.deposita(dep);
                        JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso. \n Você depositou: R$ " + dep);
                        int p = Integer.parseInt(JOptionPane.showInputDialog("Deseja ver o saldo? \n 1- SIM \n 2- NÃO "));
                        if (p == 1) {
                            JOptionPane.showMessageDialog(null, cp.getSaldo());
                        }
                        int q = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar outra transação? \n 1- SIM \n 2- NÃO "));
                        if (q == 1) {
                            menu = 0;

                        } else {
                            menu = 10;
                            break;
                        }

                    case 4: //voltar
                        menu = 0;
                        break;
                    case 5: //sair
                        menu = 10;
                        break;
                }

            }
        }

    }
}
