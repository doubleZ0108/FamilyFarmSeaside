package main.java.com.familyFarmSeaside.Animal.DetailSpecies;

import main.java.com.familyFarmSeaside.Animal.Animal;
import main.java.com.familyFarmSeaside.Animal.Species.Fish;

import java.util.Random;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public class Perch extends Fish implements Cloneable{
    public Perch() {
        super();
        detailedSpecies = "PERCH";
        sellValue = 70;
        buyValue = 35;
    }

    public Perch(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue, species, detailedSpecies, sex, lifestage, age, hungerValue);
    }

    @Override
   public void eat() {
        System.out.println("I am Perch!");
        System.out.println("I am eating!");
   }

   @Override
   public void sleep() {
       System.out.println("I am Perch!");
       System.out.println("I am sleeping!");
   }

   @Override
   public void mating() {
       System.out.println("I am Perch!");
       System.out.println("I am mating with another Perch!");
    }

    @Override
     public Perch breed() {
        return new Perch();
   }

   @Override
   public void swim() {
       System.out.println("I am Perch!");
       System.out.println("I am swiming!");
   }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Perch newperch = (Perch) super.clone();
        Random rand = new Random();
        if(rand.nextInt(2) + 0==1) {
            newperch.sex = Sex.MALE;
        }
        else {
            newperch.sex=Sex.FEMALE;
        }
        return newperch;
    }

    @Override
    public  boolean equals(Object obj){
        if (this == obj)      //The incoming object is itself, equal
        {return true;}
        if (obj == null)     //If the passed in object is empty, not equal
        {return false;}
        if (getClass() != obj.getClass())  //If not the same type, not equal
        {return false;}

        Perch perch = (Perch) obj;
        if(this.detailedSpecies==perch.detailedSpecies && this.species.equals(perch.species)
                && this.sex==perch.sex&&this.age==perch.age&&this.lifestage==perch.lifestage){
            {return true;}
        }
        return false;
    }

    @Override
    public String toString() {
        return "class Perch extends Fish implements Cloneable";
    }
}
