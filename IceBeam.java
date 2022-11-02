package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Aegislash aegislash = new Aegislash("aegislash", 1);
        Doublade doublade = new Doublade("doublade", 1);
        Honedge honedge = new Honedge("honedge", 1);
        Abomasnow abomasnow = new Abomasnow(" abomasnow", 1);
        Snover snover = new Snover("snover", 1);
        Raikou  raikou = new Raikou("raikou", 1);
        b.addAlly(abomasnow);
        b.addAlly(snover);
        b.addAlly(aegislash);
        b.addFoe(raikou);
        b.addFoe(honedge);
        b.addFoe(doublade);
        b.go();


    }

    public static boolean chance(double v) {
        return v> Math.random();
    }
}
