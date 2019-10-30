package main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable;

import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/25
 **/
public class Tomato extends Vegetable {

    public Tomato(){
        this.detailedSpecies= "TOMATO";
        sellValue = 60;
        buyValue = 30;
    }

    @Override
    public String toString() {
        return "Vegetable->Tomato";
    }
}
