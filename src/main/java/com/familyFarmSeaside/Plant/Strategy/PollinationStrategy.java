package main.java.com.familyFarmSeaside.Plant.Strategy;

import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;

/**
 * @program: FamilyFarmSeaside-master
 * @description: interface of pollination strategy
 * @author: Di
 * @create: 2019/10/30
 **/
public interface PollinationStrategy {
    void pollinate(Apple a);
    void pollinate(Cherry c);
    void pollinate(Potato p);
    void pollinate(Tomato t);
}
