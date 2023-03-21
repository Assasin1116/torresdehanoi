/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego.torrez.de.hanoi;

public class metodo {

    public void movimientos(byte discos, char a, char b, char c) {
        if (discos == 1) {
            System.out.println("mover disco 1-" + a + " a " + b);
        } else {
            movimientos((byte) (discos - 1), a, c, b);
            System.out.println("mover discos " + discos + "-" + a + " a " + b);
            movimientos((byte) (discos - 1), c, b, a);
        }
    }

    public byte movexactos(byte discos) {
        byte movimientos = (byte) Math.pow(2, discos);
        movimientos--;
        return movimientos;

    }
}
