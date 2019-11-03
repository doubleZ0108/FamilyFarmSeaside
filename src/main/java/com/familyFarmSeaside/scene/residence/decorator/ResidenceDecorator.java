package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

/**
 * @program: FamilyFarmSeaside
 * @description: Decorator which can be installed in a residence. It is an abstract class which can be extended.
 * @author: Yimin Li
 * @create: 2019/10/25
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
