package ru.ifmo.se.pokemon;

public class Raikou extends Pokemon {
    public Raikou(String name, int level){
        super(name, level);
        super.setStats(90, 85, 75, 115, 100, 115);
        super.setType(Type.ELECTRIC);
        CalmMind CalmMind =new CalmMind( 0, 0);
        Thunder Thunder =new Thunder( 110, 70);
        Thunderbolt Thunderbolt =new Thunderbolt( 90, 100);
        ChargeBeam ChargeBeam = new ChargeBeam(50,90);
        super.setMove(ChargeBeam,Thunderbolt,Thunder);
    }
}
