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
    public Chicken breed() {
        return new Chicken();
    }

    @Override
    public void fly() {

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

    //重写equals函数
    @Override
    public  boolean equals(Object obj){
        if (this == obj)      //传入的对象是其本身，相等的；
            return true;
        if (obj == null)     //如果传入的对象为空，不相等
            return false;
        if (getClass() != obj.getClass())  //如果不是同一个类型的，不相等
            return false;
        Chicken chicken = (Chicken) obj;
        if(this.detailedSpecies==chicken.detailedSpecies && this.species.equals(chicken.species)
                && this.sex==chicken.sex&&this.age==chicken.age&&this.lifestage==chicken.lifestage){
            return true;
        }
        return false;
    }

}
