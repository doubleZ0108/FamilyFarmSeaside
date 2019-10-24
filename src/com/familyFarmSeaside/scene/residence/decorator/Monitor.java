package com.familyFarmSeaside.scene.residence.decorator;

import com.familyFarmSeaside.scene.residence.Residence;

public class Monitor extends ResidenceDecorator{
    public Monitor(Residence r){
        super(r);
    }

    @Override
    public double getCost() {
        return residence.getCost() + 500; //一张价桌子价格500
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "\n加了一个监视器";
    }
}
