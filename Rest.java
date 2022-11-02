package ru.ifmo.se.pokemon;

public class Snover extends Pokemon {
    public Snover(String name, int level) {
        super(name, level);
        super.setStats(60, 62, 50, 62, 60, 40);
        super.setType(Type.GRASS, Type.ICE);
        Rest Rest = new Rest(90, 100);
        IceBeam IceBeam = new IceBeam(90, 100);
        Blizzard Blizzard = new Blizzard(110, 70);
        super.setMove(IceBeam,Blizzard,Rest);
    }

}
