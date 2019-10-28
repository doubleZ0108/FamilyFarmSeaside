package main.java.com.familyFarmSeaside.Product.Factory;

import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.Fruit;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;

import java.util.Vector;

/**
 * @program: FamilyFarmSeaside
 * @description: Spring product factory can product Fruit(Apple) & Vegetable(potato).
 * @author: Zhe Zhang
 * @create: 2019/10/28
 **/
public class SpringProductFactory extends ProductFactory {
    public SpringProductFactory() {
        super();
        this.fruit_species = new Apple().toString();
        this.vegetable_species = new Potato().toString();
    }

    public SpringProductFactory(Vector<Fruit> store_fruits_warehouse, Vector<Vegetable> store_vegetables_warehouse) {
        super(store_fruits_warehouse, store_vegetables_warehouse);
        this.fruit_species = new Apple().toString();
        this.vegetable_species = new Potato().toString();
    }

    @Override
    protected Fruit createFruit() {
        System.out.println("*** create an apple... ***");
        return new Apple();
    }

    @Override
    public Vegetable createVegetable() {
        System.out.println("*** create a potato... ***");
        return new Potato();
    }

    @Override
    public String toString() {
        return "ProductFactory->SpringProductFactory";
    }
}
