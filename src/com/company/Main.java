package com.company;

public class Main {

    public static void main(String[] args) {
        Boss darkstar = new Boss();
        darkstar.setDamage(45);
        darkstar.setHearth(900);
        darkstar.setDefType("Fire");
        System.out.println("Darkstar " + " " + darkstar.getDamage() + " " + darkstar.getHearth() + " " + darkstar.getDefType());

        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHearth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getAtttype());
        }

    }

    static Hero[] createHeroes() {
        Hero ironMan = new Hero(400, 25, "Water");
        Hero hulk = new Hero(600, 30);
        Hero scarletWitch = new Hero(200, 40, "Mental");
        Hero[] arr = {scarletWitch, hulk, ironMan};
        return arr;
       /* return new Hero[]{
                new Hero(400, 25, "Water"),
                new Hero(600, 30),
                new Hero(200, 40, "Pyikik")
        };   укороченный*/
    }
}
