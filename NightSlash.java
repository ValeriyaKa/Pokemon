package ru.ifmo.se.pokemon;

public class Rest extends SpecialMove{
    public Rest(double pow,double acc){
        super(Type.PSYCHIC, pow, acc);
    }
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        double hp=pokemon.getHP()-60;
        pokemon.setMod(Stat.HP,(int) hp);
        pokemon.setCondition(e);
    }
}
