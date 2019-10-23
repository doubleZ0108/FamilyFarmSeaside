package com.familyFarmSeaside.scene.residence.decorator;

import com.familyFarmSeaside.scene.residence.Residence;

public class Desk extends ResidenceDecorator{
    public Desk(Residence r){
        super(r);
    }

    @Override
    public double getCost() {
        return residence.getCost() + 500; //一张价桌子价格500
    }
}
