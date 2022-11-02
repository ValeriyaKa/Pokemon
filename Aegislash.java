package ru.ifmo.se.pokemon;

public class Blizzard extends SpecialMove{
        public Blizzard(double pow,double acc){
            super(Type.ICE,pow,acc);
        }
        protected String describe(){return "Использует Blizzard ";}
        protected void applyOppDamage(Pokemon pokemon, double pow){pokemon.setMod(Stat.HP, (int) pow);}
        protected void applyOppEffects(Pokemon pokemon){
            super.applyOppEffects(pokemon);

                Effect f = new Effect().chance(0.1).condition(Status.FREEZE);
            pokemon.setCondition(f);
        }
}
