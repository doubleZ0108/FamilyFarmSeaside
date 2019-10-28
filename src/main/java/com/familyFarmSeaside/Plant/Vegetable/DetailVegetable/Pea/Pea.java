package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Pea;

import main.java.com.familyFarmSeaside.Plant.Color.Color;
import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;

/**
 * @program: FamilyFarmSeaside
 * @description: Pea class for Bridge Pattern
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public abstract class Pea extends Vegetable {
    public Pea(Color color) {
        super();
        detailedSpecies = "PEA";
        this.color=color;
    }
    protected Color color;
    public abstract String getName();


}