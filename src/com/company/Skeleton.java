package com.company;

public class Skeleton extends Boss {
private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
public String PrintInfo(){
        return "Skeleton health: " + this.getHealth() + " Skeleton damage: " + this.getDamage() + " Skeleton Weapon Type: " + this.getWeapon().getWeaponType() +
                " Name of the Weapon: " + this.getWeapon().getNameOfTheWeapon() + " Number of arrows: " + this.getNumberOfArrows();
}
}
