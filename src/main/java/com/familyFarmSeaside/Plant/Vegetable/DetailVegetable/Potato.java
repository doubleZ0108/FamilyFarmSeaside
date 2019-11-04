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
        super("POTATO");
        sellValue = 50;
        buyValue = 25;
    }

    @Override
    public String toString() {
        return "Vegetable->Potato";
    }

    /**
     * harvest the plant
     */
    public void harvested(){
        if(this.isHarvestable()) {
            this.plantState.moveToNext(this);
            System.out.println("By harvesting this potato, you got 5 potato seeds and 1 potato product.");
        }else if(this.isDead()) {
            //do nothing
        }else{
            System.out.println("This " + this.getPlantType() + " hasn't been harvestable yet.");
        }
    }
}
