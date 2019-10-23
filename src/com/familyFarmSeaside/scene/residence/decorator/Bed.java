package com.familyFarmSeaside.scene.residence.decorator;

import com.familyFarmSeaside.scene.residence.Residence;

public class Bed extends ResidenceDecorator {

    public Bed(Residence r){
        super(r);
    }

    @Override
    public double getCost() {
        return residence.getCost() + 1000; //一张床价格1000
    }
}
