package main.java.com.familyFarmSeaside.Animal.Species;

import main.java.com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description: Abstract mammal class who extend from Animal.
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Mammals extends Animal {
    public Mammals() {
        super();
        species = SpeciesName.MAMMALS;
    }

    public Mammals(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue, species, detailedSpecies, sex, lifestage, age, hungerValue);
    }

    /* special behavior of mammals*/
    abstract protected void run();

    @Override
    public String toString() {
        return "abstract class Mammals extends Animal";
    }
}
