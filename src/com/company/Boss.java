package com.company;

public class Boss extends GameEntity{
    private Weapon Weapon;

    public com.company.Weapon getWeapon() {
        return Weapon;
    }

    public void setWeapon(com.company.Weapon weapon) {
        Weapon = weapon;
    }

    public String PrintInfo() {
        return "Boss health: " + this.getHealth() + " Boss damage: " + this.getDamage() + " Boss Weapon Type: " + this.getWeapon().getWeaponType() +
                " Name of the Weapon: " + this.getWeapon().getNameOfTheWeapon();
    }

    }

