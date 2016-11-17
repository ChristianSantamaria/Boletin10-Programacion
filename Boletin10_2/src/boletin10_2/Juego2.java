/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Juego2 {

    int primer = (int) (Math.random() * 50 + 1);
    int intentos = 10;
    int segundo;

    public void ejecutarJuego() {
        for (int i = 0; i < intentos; i++) {
            segundo = Integer.parseInt(JOptionPane.showInputDialog("Elija un numero?"));
            if (segundo == primer) {
                JOptionPane.showMessageDialog(null, "VICTORIA!!");
                break;
            } else if ((i + 1) == intentos) {
                JOptionPane.showMessageDialog(null, "DERROTA!!");
                break;
            } else {
                int aux;
                if (primer > segundo) {
                    aux = (primer - segundo);
                } else {
                    aux = (segundo - primer);
                }

                if (aux > 20) {
                    JOptionPane.showMessageDialog(null, "Moi lonxe");
                } else if (aux >= 10) {
                    JOptionPane.showMessageDialog(null, "Lonxe");
                } else if (aux >= 5) {
                    JOptionPane.showMessageDialog(null, "Preto");
                } else {
                    JOptionPane.showMessageDialog(null, "Moi preto");
                }

            }
        }
    }
}
