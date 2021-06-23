package src.personajes;

import java.util.Random;

public class Personaje {
    private int Vida;
    private int Armadura;
    private int NivelAtaque;
    private String Tipo;
    Random Dado = new Random();

    public Personaje() {
        this.Armadura = Dado.nextInt(21) + 50;
    }

    public void Atacar(Personaje Jugador2) {
        if (NivelAtaque > Jugador2.getArmadura()) {
            int VidaRestante = NivelAtaque - Jugador2.getArmadura();
            Jugador2.setVida(Jugador2.getVida() - VidaRestante);
        }
    }

    public void AsignarAtaque(Random Dado1) {
        int Turno1 = Dado1.nextInt(101);
        int Turno2 = Dado1.nextInt(101);
        if (Turno1 > Turno2)
            NivelAtaque = Turno1;
        else
            NivelAtaque = Turno2;
    }

    public int getArmadura() {
        return Armadura;
    }

    public int getVida() {
        return Vida;
    }

    public int getNivelAtaque() {
        return NivelAtaque;
    }

    public void setArmadura(int armadura) {
        Armadura = armadura;
    }

    public void setNivelAtaque(int nivelAtaque) {
        NivelAtaque = nivelAtaque;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + Tipo + " Vida: " + Vida + " Armadura:  " + Armadura + " Nivel de ataque: " + NivelAtaque;
    }

}
