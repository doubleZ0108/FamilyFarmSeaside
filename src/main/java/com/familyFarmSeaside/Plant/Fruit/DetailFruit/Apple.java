package main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit;

import main.java.com.familyFarmSeaside.Plant.Flower.FemaleFlower.FemaleFlower;
import main.java.com.familyFarmSeaside.Plant.Flower.Flower;
import main.java.com.familyFarmSeaside.Plant.Flower.MaleFlower.MaleFlower;
import main.java.com.familyFarmSeaside.Plant.Fruit.Fruit;
import main.java.com.familyFarmSeaside.Plant.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/25
 **/
public class Apple extends Fruit {
    protected List<Flower> femaleFlowerList = new ArrayList<>();
    protected List<Flower> maleFlowerList = new ArrayList<>();

    public Apple(){
        this.detailedSpecies= "APPLE";
        sellValue = 100;
        buyValue = 50;
    }

    @Override
    public String toString() {
        return "Fruit->Apple";
    }

    public void flowering(){
        Random rand = new Random();
        for(int i=0;i<rand.nextInt(6) + 5;i++) {
            FemaleFlower flower = new FemaleFlower();
            femaleFlowerList.add(flower);
        }
        for(int i=0;i<rand.nextInt(6) + 5;i++) {
            MaleFlower flower = new MaleFlower();
            maleFlowerList.add(flower);
        }
    }
    public  List<Flower> getFemaleFlowerList(){
        return femaleFlowerList;
    }
    public  List<Flower>getMaleFlowerList(){
        return maleFlowerList;
    }
}

