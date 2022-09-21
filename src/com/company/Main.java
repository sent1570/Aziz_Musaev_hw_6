package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon c2 = new Weapon();
        c2.setWeaponType(WeaponType.Cold);
        c2.setNameOfTheWeapon("Sword");
        Weapon c3 = new Weapon();
        c3.setWeaponType(WeaponType.Throwing);
        c3.setNameOfTheWeapon("Bow");
        Boss c1 = new Boss();
       c1.setHealth(1000);
       c1.setDamage(50);
       c1.setWeapon(c2);
       Skeleton c4 = new Skeleton();
       c4.setHealth(310);
       c4.setDamage(25);
       c4.setWeapon(c3);
       c4.setNumberOfArrows(30);
        Skeleton c5 = new Skeleton();
        c5.setHealth(300);
        c5.setDamage(20);
        c5.setWeapon(c3);
        c5.setNumberOfArrows(40);
       System.out.println(c1.PrintInfo());
        System.out.println();
       System.out.println(c4.PrintInfo());
        System.out.println(c5.PrintInfo());


    }
}
