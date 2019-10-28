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
    }

    @Override
    public SpeciesName getSpecies() {
        return this.species;
    }

    @Override
    public String getDetailedSpecies() {
        return this.detailedSpecies;
    }

    @Override
    public Sex getSex() {
        return this.sex;
    }

    @Override
    public LifeStage getLifestage() {
        return this.lifestage;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getHungerValue() {
        return this.hungerValue;
    }

   @Override
   public void eat() {

   }

   @Override
   public void sleep() {

   }

   @Override
   public void mating() {

    }

    @Override
     public Perch breed() {
        return new Perch();
   }

   @Override
   public void swim() {

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
        if (this == obj)      //传入的对象是其本身，相等的；
            return true;
        if (obj == null)     //如果传入的对象为空，不相等
            return false;
        if (getClass() != obj.getClass())  //如果不是同一个类型的，不相等
            return false;
        Perch perch = (Perch) obj;
        if(this.detailedSpecies==perch.detailedSpecies && this.species.equals(perch.species)
                && this.sex==perch.sex&&this.age==perch.age&&this.lifestage==perch.lifestage){
            return true;
        }
        return false;
    }
}
