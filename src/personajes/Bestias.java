package src.personajes;

import java.util.Random;

public class Bestias extends Personaje {

    public Bestias() {

    }

    @Override
    public void AsignarAtaque(Random Dado1) {
        int Turno1 = Dado1.nextInt(90);
        this.setNivelAtaque(Turno1);
    }

}
