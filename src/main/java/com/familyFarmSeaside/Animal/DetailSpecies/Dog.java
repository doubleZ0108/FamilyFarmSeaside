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

  //@Override
  public void eat() {
        System.out.println("I am a dog!");
        System.out.println("I'm going to eat!");
        System.out.println("Food delicious! wangwangwang!");

  }

  //@Override
  public void sleep() {
      System.out.println("I am a dog!");
      System.out.println("I'm going to sleep!");
      System.out.println("Good dream! wangwangwang!");
  }

  @Override
  public void mating() {

  }

  @Override
  public Dog breed() {
        return  new Dog();
  }

  @Override
  protected void run() {

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
        if (this == obj)      //传入的对象是其本身，相等的；
            return true;
        if (obj == null)     //如果传入的对象为空，不相等
            return false;
        if (getClass() != obj.getClass())  //如果不是同一个类型的，不相等
            return false;
        Dog dog = (Dog) obj;
        if(this.detailedSpecies==dog.detailedSpecies && this.species.equals(dog.species)
                && this.sex==dog.sex&&this.age==dog.age&&this.lifestage==dog.lifestage){
            return true;
        }
        return false;
    }

}
