package ru.ifmo.se.pokemon;

public class MetalSound extends SpecialMove {
    public MetalSound(double pow, double acc){
      super(Type.STEEL, pow, acc);
    }
    protected String describe(){return "Использует MetalSound ";}
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 2);
    }
}
