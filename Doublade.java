package ru.ifmo.se.pokemon;

public class DoubleTeam extends SpecialMove {
    public DoubleTeam( double pow , double acc){
        super(Type.NORMAL,pow, acc);
    }
    protected String describe(){return "Использует DoubleTeam ";}
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.EVASION, 1);
    }
}
