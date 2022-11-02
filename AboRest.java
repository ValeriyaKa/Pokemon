package ru.ifmo.se.pokemon;

public class Aegislash extends Pokemon {
    public Aegislash(String name, int level) {
        super(name, level);
        super.setStats(59, 110, 150, 45, 49, 35);
        super.setType(Type.STEEL, Type.GHOST);
        DoubleTeam DoubleTeam= new DoubleTeam(0,0);
        MetalSound MetalSound = new MetalSound(0, 80);
        RockSlide RockSlide = new RockSlide(75, 90);
        NightSlash NightSlash = new NightSlash(70, 100);
        super.setMove(RockSlide, NightSlash);
    }
}
