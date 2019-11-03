package main.java.com.familyFarmSeaside.Animal.DetailSpecies;

import main.java.com.familyFarmSeaside.Animal.Species.Poultry;

import java.util.Random;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public class Chicken extends Poultry implements Cloneable{
    public Chicken() {
        super();
        detailedSpecies = "CHICKEN";
        sellValue = 100;
        buyValue = 50;
    }

    public Chicken(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue, species, detailedSpecies, sex, lifestage, age, hungerValue);
    }

    @Override
    public void eat() {
        System.out.println("I am Chicken!");
        System.out.println("I am eating!");
    }

    @Override
    public void sleep() {
        System.out.println("I am Chicken!");
        System.out.println("I am sleeping!");
    }

    @Override
    public void mating() {
        System.out.println("I am Chicken!");
        System.out.println("I am mating with another Chicken!");
    }

    @Override
    public Chicken breed() {
        return new Chicken();
    }

    @Override
    public void fly() {
        System.out.println("I am Chicken!");
        System.out.println("I am flying!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Chicken newchicken = (Chicken) super.clone();
        Random rand = new Random();
        if(rand.nextInt(2) + 0==1) {
            newchicken.sex = Sex.MALE;
        }
        else {
            newchicken.sex=Sex.FEMALE;
        }
        return newchicken;
    }

    //Override equals method
    @Override
    public  boolean equals(Object obj){
        if (this == obj)      //The incoming object is itself, equal
        {return true;}
        if (obj == null)     //If the passed in object is empty, not equal
        {return false;}
        if (getClass() != obj.getClass())  //If not the same type, not equal
        {return false;}
        Chicken chicken = (Chicken) obj;
        if(this.detailedSpecies==chicken.detailedSpecies && this.species.equals(chicken.species)
                && this.sex==chicken.sex&&this.age==chicken.age&&this.lifestage==chicken.lifestage){
            {return true;}
        }
        return false;
    }

    @Override
    public String toString() {
        return "class Chicken extends Poultry implements Cloneable";
    }
}
