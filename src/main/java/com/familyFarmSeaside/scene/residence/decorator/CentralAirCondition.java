package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

/**
 * @program: FamilyFarmSeaside
 * @description: central air condition which can be installed in a residence.
 * @author: Yimin Li
 * @create: 2019/10/25
 **/
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

    @Override
    public String toString() {
        return "class CentralAirCondition extends ResidenceDecorator";
    }
}
