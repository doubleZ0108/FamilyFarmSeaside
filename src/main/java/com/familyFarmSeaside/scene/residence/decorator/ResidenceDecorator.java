package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

//此类用于装饰器模式，代表住宅的装饰器
public abstract class ResidenceDecorator extends Residence {
    protected Residence residence; //被该ResidenceDecorator装饰的Residence

    public ResidenceDecorator(Residence r){
        residence = r;
    }

    @Override
    public abstract double getCost();
}
