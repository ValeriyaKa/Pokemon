package ru.ifmo.se.pokemon;

public class IceBeam extends SpecialMove {
    public IceBeam(double pow,double acc){
        super(Type.ICE,pow,acc);
    }
    @Override
    protected String describe(){return "Использует IceBeam ";}
    @Override
    protected void applyOppDamage(Pokemon pokemon,double pow){pokemon.setMod(Stat.HP, (int) pow);}
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect f = new Effect().chance(0.1).condition(Status.FREEZE);
        pokemon.setCondition(f);

    }

}
