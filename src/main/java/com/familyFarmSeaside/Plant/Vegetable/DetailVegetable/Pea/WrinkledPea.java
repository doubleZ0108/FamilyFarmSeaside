package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Pea;

import main.java.com.familyFarmSeaside.Plant.Color.Color;

/**
 * @program: FamilyFarmSeaside
 * @description: another subclass of pea;wrinkled;using bridge pattern
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public class WrinkledPea extends Pea {
    public WrinkledPea(Color color) {
        super(color);
    }

    public String getName(){
        return color.getColor()+"Wrinkled Pea";

    }
}