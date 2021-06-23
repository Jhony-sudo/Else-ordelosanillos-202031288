package src.bestias;

import src.personajes.Bestias;
import src.personajes.Personaje;

public class Orco extends Bestias {

    public Orco() {
        this.setVida(300);
        this.setTipo("Orco");
    }

    @Override
    public void Atacar(Personaje Jugador2) {
        int Armadura = Jugador2.getArmadura() - (10 * Jugador2.getArmadura() / 100);
        if (this.getNivelAtaque() > Armadura) {
            int VidaRestante = this.getNivelAtaque() - Armadura;
            Jugador2.setVida(Jugador2.getVida() - VidaRestante);
        }
    }

}
