package juego.torrez.de.hanoi;

import java.util.Scanner;

public class JuegoTorrezDeHanoi {

    public static void main(String[] args) {
        byte discos, opcion = 0, movimientos;
        char A, B, C;
        metodo meto = new metodo();
        Scanner obj = new Scanner(System.in);
        do {
            try {
                System.out.println("Lngrese la cantida de discos");
                discos = obj.nextByte();
                meto.movimientos(discos, 'A', 'C', 'B');
                movimientos = meto.movexactos(discos);
                System.out.println("******************************************");
                if (discos == 1) {
                    System.out.println("Los movimientos exactos son 1");
                } else {
                    System.out.println("Los movimientos exactos son " + movimientos);
                }
                System.out.println("Ingrese 1 para continuar");
                opcion = obj.nextByte();
            } catch (Exception e) {
                System.out.println("Error " + e);
            }

        } while (opcion <= 2);

    }

}
