package main.java.com.familyFarmSeaside.Supply.Mediator;

import main.java.com.familyFarmSeaside.Plant.Flower.Flower;

/**
 * @program: FamilyFarmSeaside
 * @description: mediator interface
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public interface Mediator {
    public void register(Flower flower);
    public void reply(Flower fl);
}
