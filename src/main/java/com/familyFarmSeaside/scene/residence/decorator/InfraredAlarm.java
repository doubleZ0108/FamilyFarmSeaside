package main.java.com.familyFarmSeaside.scene.residence.decorator;

import main.java.com.familyFarmSeaside.scene.residence.Residence;

/**
 * @program: FamilyFarmSeaside
 * @description: Infrared Alarm which can be installed in a residence.
 * @author: Yimin Li
 * @create: 2019/10/25
 **/
public class InfraredAlarm extends ResidenceDecorator {

    public InfraredAlarm(Residence r){
        super(r);
        System.out.println("添加一个红外报警器");
    }

    @Override
    public double getCost() {
        return residence.getCost() + 1000; //一个红外报警器价格1000
    }

    @Override
    public String getDescription() {
        return residence.getDescription() + "，加了一个红外报警器";
    }

    @Override
    public String toString() {
        return "class InfraredAlarm extends ResidenceDecorator";
    }
}
