package src.heroes;

import src.bestias.Orco;
import src.personajes.Heroes;
import src.personajes.Personaje;

public class Elfo extends Heroes {

    public Elfo() {
        this.setVida(250);
        this.setTipo("Elfo");
    }

    @Override
    public void Atacar(Personaje Jugador2) {
        if (Jugador2 instanceof Orco) {
            this.setNivelAtaque(this.getNivelAtaque() + 10);
            if (this.getNivelAtaque() > Jugador2.getArmadura()) {
                int VidaRestante = this.getNivelAtaque() - Jugador2.getArmadura();
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
