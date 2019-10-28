package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Pea;

import main.java.com.familyFarmSeaside.Plant.Color.Color;

/**
 * @program: FamilyFarmSeaside
 * @description: one of subclasses of pea;smooth;using bridge pattern
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public class SmoothPea extends Pea{


    public SmoothPea(Color color) {
        super(color);
    }

    public String getName(){
        return color.getColor()+"Smooth Pea";

    }
}