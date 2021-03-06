package main.java.com.familyFarmSeaside.Product.ProductFactory;

import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Fruit.Fruit;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;

import java.util.Vector;

/**
 * @program: FamilyFarmSeaside
 * @description: Spring product factory can product Fruit(Cherry) & Vegetable(tomato).
 * @author: Zhe Zhang
 * @create: 2019/10/28
 **/
public class SummerProductFactory extends ProductFactory {
    public SummerProductFactory() {
        /**
         * @description: the species this product factory product is apple and potato
         *
         * @return : null
         **/
        super();
        this.fruit_species = new Cherry().toString();
        this.vegetable_species = new Tomato().toString();
    }

    public SummerProductFactory(Vector<Fruit> store_fruits_warehouse, Vector<Vegetable> store_vegetables_warehouse) {
        /**
         * @description: the species this product factory product is cherry and tomato. And use previous products in previous warehouse to build new warehouse.
         *
         * @return : null
         **/
        super(store_fruits_warehouse, store_vegetables_warehouse);
        this.fruit_species = new Cherry().toString();
        this.vegetable_species = new Tomato().toString();
    }

    @Override
    public Fruit createFruit() {
        System.out.println("*** create a cherry... ***");
        return new Cherry();
    }

    @Override
    public Vegetable createVegetable() {
        System.out.println("*** create a tomato... ***");
        return new Tomato();
    }

    @Override
    public String toString() {
        return "class SummerProductFactory extends ProductFactory";
    }
}
