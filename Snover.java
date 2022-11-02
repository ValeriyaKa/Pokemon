package ru.ifmo.se.pokemon;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected String describe(){return "Использует Thunderbolt ";}
    @Override
    protected void applyOppDamage(Pokemon pokemon,double pow){pokemon.setMod(Stat.HP, (int) pow);}
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect par = new Effect().chance(0.1).condition(Status.PARALYZE );
        pokemon.setCondition(par);
    }
}
