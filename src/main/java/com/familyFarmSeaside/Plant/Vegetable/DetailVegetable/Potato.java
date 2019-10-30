package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable;

import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/25
 **/
public class Potato extends Vegetable {

    public Potato(){
        this.detailedSpecies= "POTATO";
        sellValue = 50;
        buyValue = 25;
    }

    @Override
    public String toString() {
        return "Vegetable->Potato";
    }
}
