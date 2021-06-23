package src.principal;

import java.util.Scanner;

import src.campodebatalla.Batalla;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Seleccion;
        int Tam;

        System.out.println("------El señor de los anillos-------");
        do {
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            Seleccion = leer.nextInt();
            if (Seleccion == 1) {
                System.out.println("Cuantos jugadores desea");
                Tam = leer.nextInt();
                Batalla Jugar = new Batalla(Tam);
            }
        } while (Seleccion != 2);
    }

}