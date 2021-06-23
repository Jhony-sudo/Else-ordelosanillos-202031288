package src.campodebatalla;

import java.util.Random;
import java.util.Scanner;

import src.bestias.Orco;
import src.bestias.Trasgo;
import src.heroes.Elfo;
import src.heroes.Hobbit;
import src.heroes.Humano;
import src.personajes.*;

public class Batalla {
    public int TAM_EQUIPO = 2;
    private int Contador = TAM_EQUIPO;
    private int Contador2 = TAM_EQUIPO;
    private Heroes[] Ejercito1 = new Heroes[TAM_EQUIPO];
    private Bestias[] Ejercito2 = new Bestias[TAM_EQUIPO];
    Random R = new Random();
    Scanner leer = new Scanner(System.in);

    public Batalla(int Tam) {
        this.TAM_EQUIPO = Tam;
        LlenarEjercito();
        Jugar();
    }

    public void Jugar() {
        int Ronda = 1;
        String Alto;
        do {
            int Posicion;
            if (Contador > Contador2) {
                Posicion = R.nextInt(Contador2);
            } else
                Posicion = R.nextInt(Contador);

            System.out.println(Posicion);
            System.out.println("Ronda: " + Ronda);
            Ejercito1[Posicion].AsignarAtaque(R);
            Ejercito2[Posicion].AsignarAtaque(R);
            System.out
                    .println("Lucha entre " + Ejercito1[Posicion].toString() + " VS " + Ejercito2[Posicion].toString());
            Ejercito1[Posicion].Atacar(Ejercito2[Posicion]);
            Ejercito2[Posicion].Atacar(Ejercito1[Posicion]);
            System.out.println("Fin Lucha");
            System.out.println(Ejercito1[Posicion].toString());
            System.out.println(Ejercito2[Posicion].toString());
            Muerte(Posicion);
            Ronda++;
            Alto = leer.nextLine();
        } while (!FinalizaJuego());

    }

    public boolean FinalizaJuego() {
        boolean Resultado = false;
        if (Contador == 0) {
            System.out.println("Ganan las Bestias");
            Resultado = true;
        }
        if (Contador2 == 0) {
            System.out.println("Ganana los heroes");
            Resultado = true;
        }
        return Resultado;
    }

    public void LlenarEjercito() {
        for (int i = 0; i < Ejercito1.length; i++) {
            int r = R.nextInt(3) + 1;
            int r2 = R.nextInt(2) + 1;
            switch (r) {
                case 1:
                    Ejercito1[i] = new Humano();
                    break;
                case 2:
                    Ejercito1[i] = new Elfo();
                    break;
                case 3:
                    Ejercito1[i] = new Hobbit();
                    break;
            }
            if (r2 == 1)
                Ejercito2[i] = new Trasgo();
            else
                Ejercito2[i] = new Orco();
        }

    }

    public void Muerte(int Posicion) {
        if (Ejercito1[Posicion].getVida() <= 0) {
            for (int i = Posicion; i < TAM_EQUIPO - 1; i++) {
                Ejercito1[Posicion] = Ejercito1[Posicion + 1];
            }
            Contador--;
        }

        if (Ejercito2[Posicion].getVida() <= 0) {
            for (int i = Posicion; i < TAM_EQUIPO - 1; i++) {
                Ejercito2[Posicion] = Ejercito2[Posicion + 1];
            }
            Contador2--;
        }
    }
}
