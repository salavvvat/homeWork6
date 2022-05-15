package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss(700, 60 );
    boss.weapon.setTypeOfWeapon( "cold");
    boss.weapon.setNameOfWeapon("excalibur");
        System.out.println( boss.printInfo());
    }
}
