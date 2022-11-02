package ru.ifmo.se.pokemon;

public class Honedge extends Pokemon {
    public Honedge(String name, int level){
        super(name, level);
        super.setStats(65, 80,100,35,37,28);
        super.setType(Type.STEEL,Type.GHOST);
        RockSlide RockSlide = new RockSlide(75,90);
        NightSlash NightSlash= new NightSlash(70,100);
        super.setMove(RockSlide,NightSlash);
    }
}
