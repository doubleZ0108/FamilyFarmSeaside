package main.java.com.familyFarmSeaside.Product;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Perch;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: This is the base class of all products.
 * @author: doubleZ
 * @create: 2019/10/25
 **/
public abstract class Product {
    //有关买卖的部分
    protected int sellValue = 0;
    protected int buyValue = 0;
    public int getSellValue(){
        return sellValue;
    }
    public int getBuyValue(){
        return buyValue;
    }

    public Product(int sellValue, int buyValue) {
        this.sellValue = sellValue;
        this.buyValue = buyValue;
    }

    public void setSellValue(int sellValue) {
        this.sellValue = sellValue;
    }

    public void setBuyValue(int buyValue) {
        this.buyValue = buyValue;
    }

    @Override
    public String toString() {
        return " class Product";
    }
}
