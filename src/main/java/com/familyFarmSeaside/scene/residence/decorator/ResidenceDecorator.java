package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

/**
 * @program: ResidenceDecorator.java
 *
 * @description: Used in the decorator mode and represents the decorator of the house.
 *
 * @author: Zhe Zhang
 *
 * @create: 2019/11/3
 **/
public abstract class ResidenceDecorator extends Residence {
    protected Residence residence;      //Residence decorated by the ResidenceDecorator

    public ResidenceDecorator(){
    }

    public ResidenceDecorator(Residence r){
        residence = r;
    }

    @Override
    public abstract double getCost();

    @Override
    public String toString() {
        return "abstract class ResidenceDecorator extends Residence";
    }
}
