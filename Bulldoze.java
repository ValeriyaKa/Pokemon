package ru.ifmo.se.pokemon;

public class CalmMind extends StatusMove {
    public CalmMind(double pow,double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    protected String describe(){return "Использует CalmMind ";}
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
}
