/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumnot
 */
public class Exercise1_UD2_cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i, j, filas = 6;

        for (i = 1; i <= filas; i++) {
            for (j = 1; j <= filas; j++) {
                if (j == 1 || j == filas || i == 1 || i == filas) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
