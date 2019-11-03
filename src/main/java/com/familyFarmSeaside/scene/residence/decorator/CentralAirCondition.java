package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

public class CentralAirCondition extends ResidenceDecorator {

    public CentralAirCondition(){
    }

    public CentralAirCondition(Residence r){
        super(r);
        System.out.println("添加一个中央空调");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 200; //chair 200yuan/per
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "，加了一个中央空调";
    }

    @Override
    public String toString() {
        return "class CentralAirCondition extends ResidenceDecorator";
    }
}
