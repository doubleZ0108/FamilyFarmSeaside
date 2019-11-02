package main.java.com.familyFarmSeaside.Animal.DetailSpecies;

import main.java.com.familyFarmSeaside.Animal.Species.Mammals;

import java.util.Random;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public class Dog extends Mammals {
    public Dog() {
        super();
        detailedSpecies = "DOG";
        sellValue = 200;
        buyValue = 100;
    }

    public Dog(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue, species, detailedSpecies, sex, lifestage, age, hungerValue);
    }

    @Override
  public void eat() {
        System.out.println("I am a dog!");
        System.out.println("I'm going to eat!");
        System.out.println("Food delicious! wangwangwang!");

  }

  @Override
  public void sleep() {
      System.out.println("I am a dog!");
      System.out.println("I'm going to sleep!");
      System.out.println("Good dream! wangwangwang!");
  }

  @Override
  public void mating() {
      System.out.println("I am Dog!");
      System.out.println("I am mating with another Dog!");
  }

  @Override
  public Dog breed() {
        return  new Dog();
  }

  @Override
  protected void run() {
      System.out.println("I am a dog!");
      System.out.println("I'm running!");
      System.out.println("Come and play with me");
  }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        Dog newdog = (Dog) super.clone();
        Random rand = new Random();
        if(rand.nextInt(2) + 0==1) {
            newdog.sex = Sex.MALE;
        }
        else {
            newdog.sex=Sex.FEMALE;
        }
        return newdog;
    }

    @Override
    public  boolean equals(Object obj){
        if (this == obj)      //The incoming object is itself, equal
        {return true;}
        if (obj == null)     //If the passed in object is empty, not equal
        {return false;}
        if (getClass() != obj.getClass())  //If not the same type, not equal
        {return false;}
        Dog dog = (Dog) obj;
        if(this.detailedSpecies==dog.detailedSpecies && this.species.equals(dog.species)
                && this.sex==dog.sex&&this.age==dog.age&&this.lifestage==dog.lifestage){
            {return true;}
        }
        return false;
    }

    @Override
    public String toString() {
        return "class Dog extends Mammals";
    }
}
