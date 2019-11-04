package main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit;

//import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.FemaleFlower.FemaleFlower;
import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.Flower;
//import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.MaleFlower.MaleFlower;
import main.java.com.familyFarmSeaside.Plant.Fruit.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/25
 **/
public class Apple extends Fruit implements Cloneable{
    protected List<Flower> femaleFlowerList = new ArrayList<>();
    protected List<Flower> maleFlowerList = new ArrayList<>();

    public Apple(){
        super("APPLE");
        sellValue = 100;
        buyValue = 50;
    }

    @Override
    public String toString() {
        return "Fruit->Apple";
    }

//    public void flowering(){
//        Random rand = new Random();
//        for(int i=0;i<rand.nextInt(6) + 5;i++) {
//            FemaleFlower flower = new FemaleFlower();
//            femaleFlowerList.add(flower);
//        }
//        for(int i=0;i<rand.nextInt(6) + 5;i++) {
//            MaleFlower flower = new MaleFlower();
//            maleFlowerList.add(flower);
//        }
//    }
//    public  List<Flower> getFemaleFlowerList(){
//        return femaleFlowerList;
//    }
//    public  List<Flower>getMaleFlowerList(){
//        return maleFlowerList;
//    }

    /**
     * harvest the plant
     */
    public void harvested(){
        if(this.isHarvestable()) {
            this.plantState.moveToNext(this);
        }else if(this.isDead()) {
            //do nothing
        }else{
            System.out.println("This " + this.getPlantType() + " hasn't been harvestable yet.");
        }
    }
}

