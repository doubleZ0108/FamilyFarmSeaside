package main.java.com.familyFarmSeaside.Animal.Species;

import main.java.com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Poultry extends Animal implements Cloneable{
    public Poultry() {
        super();
        species = SpeciesName.POULTRY;
    }

    abstract public void fly();
}
