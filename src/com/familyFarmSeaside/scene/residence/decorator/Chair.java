package com.familyFarmSeaside.scene.residence.decorator;

import com.familyFarmSeaside.scene.residence.Residence;

public class Chair extends ResidenceDecorator {
    public Chair(Residence r){
        super(r);
    }

    @Override
    public double getCost() {
        return residence.getCost() + 200; //一个椅子价格200
    }
}
