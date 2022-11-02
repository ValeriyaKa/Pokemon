package ru.ifmo.se.pokemon;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    protected String describe(){return "Использует ChargeBeam "; }
    protected void applyOppDamage(Pokemon pokemon, double pow){pokemon.setMod(Stat.HP, (int) pow);}
    protected void applySelfEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);

            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1).chance(0.1);
            pokemon.addEffect(e);

    }
}
