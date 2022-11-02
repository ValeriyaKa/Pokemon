package ru.ifmo.se.pokemon;

public class Bulldoze extends PhysicalMove {
    public Bulldoze (double pow,double acc){
        super(Type.GROUND,pow, acc);
    }
    protected String describe(){return "Использует Bulldoze";}
    protected void applyOppDamage(Pokemon pokemon, double pow){
        pokemon.setMod(Stat.HP, (int) pow);
    }
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPEED, -1);
    }
}
