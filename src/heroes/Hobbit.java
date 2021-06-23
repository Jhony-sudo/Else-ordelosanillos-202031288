package src.heroes;

import src.bestias.Trasgo;
import src.personajes.Heroes;
import src.personajes.Personaje;

public class Hobbit extends Heroes {

    public Hobbit() {
        this.setVida(250);
        this.setTipo("Hobbit");
    }

    @Override
    public void Atacar(Personaje Jugador2) {
        if (Jugador2 instanceof Trasgo) {
            int Ataque = this.getNivelAtaque() - 5;
            if (Ataque > Jugador2.getArmadura()) {
                int VidaRestante = Ataque - Jugador2.getArmadura();
                Jugador2.setVida(Jugador2.getVida() - VidaRestante);
            }
        } else {
            if (this.getNivelAtaque() > Jugador2.getArmadura()) {
                int VidaRestante = this.getNivelAtaque() - Jugador2.getArmadura();
                Jugador2.setVida(Jugador2.getVida() - VidaRestante);
            }
        }
    }

}
