package com.familyFarmSeaside.scene.residence.decorator;

import com.familyFarmSeaside.scene.residence.Residence;

public class CentralAirCondition extends ResidenceDecorator {
    public CentralAirCondition(Residence r){
        super(r);
        System.out.println("添加一个中央空调");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 200; //一个椅子价格200
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "，加了一个中央空调";
    }
}
