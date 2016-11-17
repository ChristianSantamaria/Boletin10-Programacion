/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Juego1 {

    public void ejecutarJuego() {
        int primer = Integer.parseInt(JOptionPane.showInputDialog("Pon un numero del 1 al 50"));;
        while ((primer < 0) && (primer > 50)) {
            primer = Integer.parseInt(JOptionPane.showInputDialog("Pon un numero del 1 al 50"));
        }
        int intentos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos intentos le das?"));
        int segundo;

        for (int i = 0; i < intentos; i++) {
            segundo = Integer.parseInt(JOptionPane.showInputDialog("Elija un numero?"));
            if (segundo == primer) {
                JOptionPane.showMessageDialog(null, "Jugador 2 GANA!!");
                break;
            } else if ((i + 1) == intentos) {
                JOptionPane.showMessageDialog(null, "Jugador 1 GANA!!");
                break;
            } else {
                if (segundo < primer) {
                    JOptionPane.showMessageDialog(null, "El numero es mas grande. Vuelve a intentarlo");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero es mas pequeño. Vuelve a intentarlo");
                }
            }
        }
    }
}
