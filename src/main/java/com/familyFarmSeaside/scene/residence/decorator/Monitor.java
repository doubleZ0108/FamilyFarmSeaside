package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

/**
 * @program: FamilyFarmSeaside
 * @description: Monitor which can be installed in a residence.
 * @author: Yimin Li
 * @create: 2019/10/25
 **/
public class Monitor extends ResidenceDecorator{

    public Monitor(){
    }

    public Monitor(Residence r){
        super(r);
        System.out.println("添加一个监视器");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 500; //table 500yuan/per
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "，加了一个监视器";
    }

    @Override
    public String toString() {
        return "class Monitor extends ResidenceDecorator";
    }
}
