package main.java.com.familyFarmSeaside.Animal.Species;

import main.java.com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Fish extends Animal {
    public Fish() {
        super();
        species = SpeciesName.FISH;
    }

    abstract public void swim();
}
