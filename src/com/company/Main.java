package com.company;

public class Main {


    public static void main(String[] args) {

        Hero h1 = new Hero();
        h1.health = 260;
        h1.attack = 25;
        h1.typeAbility = 0;

        Hero h2 = new Hero();
        h2.health = 260;
        h2.attack = 25;
        h2.typeAbility = 1;

        Hero h3 = new Hero();
        h3.health = 260;
        h3.attack = 25;
        h3.typeAbility = 2;

        Hero h4 = new Hero();
        h4.health = 260;
        h4.attack = 25;
        h4.typeAbility = 3;


        Boss Boss = new Boss();
        Boss.setHealth(700);
        Boss.setAttack(60);
        Boss.getTypeAbility(0);

    }
}


