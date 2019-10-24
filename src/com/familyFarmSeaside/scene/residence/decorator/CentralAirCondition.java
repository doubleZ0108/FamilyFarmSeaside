package com.familyFarmSeaside.scene.residence.decorator;

import com.familyFarmSeaside.scene.residence.Residence;

public class CentralAirCondition extends ResidenceDecorator {
    public CentralAirCondition(Residence r){
        super(r);
    }

    @Override
    public double getCost() {
        return residence.getCost() + 200; //一个椅子价格200
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "\n加了一个中央空调";
    }
}
