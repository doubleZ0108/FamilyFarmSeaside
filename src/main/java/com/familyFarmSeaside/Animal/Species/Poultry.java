package main.java.com.familyFarmSeaside.Animal.Species;

import main.java.com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description: Abstract poultry class who extend from Animal.
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Poultry extends Animal implements Cloneable{
    public Poultry() {
        super();
        species = SpeciesName.POULTRY;
    }

    public Poultry(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue, species, detailedSpecies, sex, lifestage, age, hungerValue);
    }

    /* special behavior of poultry*/
    abstract public void fly();


    @Override
    public String toString() {
        return "abstract class Poultry extends Animal implements Cloneable";
    }
}
