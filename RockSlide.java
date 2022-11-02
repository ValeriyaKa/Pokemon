package ru.ifmo.se.pokemon;

public class Thunder extends SpecialMove {
    public Thunder(double pow, double acc){
        super(Type.ELECTRIC ,pow, acc);
    }
    protected String describe(){return "Использует Thunder ";}
    protected void applyOppDamage(Pokemon pokemon, double pow){pokemon.setMod(Stat.HP, (int) pow);}
    protected void applyOppEffects(Pokemon pokemon) {
        Effect par = new Effect().chance(0.3).condition(Status.PARALYZE );
        pokemon.setCondition(par);
    }
}

