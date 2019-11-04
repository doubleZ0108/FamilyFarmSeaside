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
        super("TOMATO");
        sellValue = 60;
        buyValue = 30;
    }

    @Override
    public String toString() {
        return "Vegetable->Tomato";
    }

    /**
     * harvest the plant
     */
    public void harvested(){
        if(this.isHarvestable()) {
            this.plantState.moveToNext(this);
            System.out.println("By harvesting this tomato, you got 5 tomato seeds and 1 tomato product.");
        }else if(this.isDead()) {
            //do nothing
        }else{
            System.out.println("This " + this.getPlantType() + " hasn't been harvestable yet.");
        }
    }
}
