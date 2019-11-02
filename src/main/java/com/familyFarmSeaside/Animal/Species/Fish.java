package main.java.com.familyFarmSeaside.Animal.Species;

import main.java.com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description: Abstract fish class who extend from Animal.
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Fish extends Animal {
    public Fish() {
        super();
        species = SpeciesName.FISH;
    }

    public Fish(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue, species, detailedSpecies, sex, lifestage, age, hungerValue);
    }

    /* special behavior of fish*/
    abstract public void swim();

    @Override
    public String toString() {
        return "abstract class Mammals extends Animal";
    }
}
