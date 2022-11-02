package ru.ifmo.se.pokemon;

public class RockSlide extends PhysicalMove {
    public RockSlide(double pow,double acc){
        super(Type.ROCK,pow,acc);
    }
    protected String describe(){return "Использует RockSlide ";}
    protected void applyOppDamage(Pokemon pokemon, double pow){pokemon.setMod(Stat.HP, (int) pow);}
    protected void applyOppEffects(Pokemon pokemon){
        if (Main.chance(0.3)){
            Effect.flinch(pokemon);
        }
    }
}
