package com.company;

public class Hero {
    private int hearth;
    private int damage;
    private String atttype;

    public Hero(int hearth, int damage, String atttype) {
        this.hearth = hearth;
        this.damage = damage;
        this.atttype = atttype;
    }

    public Hero(int hearth, int damage) {
        this.hearth = hearth;
        this.damage = damage;
    }

    public int getHearth() {
        return hearth;
    }

    public int getDamage() {
        return damage;
    }

    public String getAtttype() {
        return atttype;
    }
}
