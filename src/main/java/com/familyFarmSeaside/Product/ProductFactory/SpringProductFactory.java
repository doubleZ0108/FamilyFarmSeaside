package main.java.com.familyFarmSeaside.Product.ProductFactory;

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
        /**
         * @description: the species this product factory product is apple and potato
         *
         * @return : null
         **/
        super();
        this.fruit_species = new Apple().toString();
        this.vegetable_species = new Potato().toString();
    }

    public SpringProductFactory(Vector<Fruit> store_fruits_warehouse, Vector<Vegetable> store_vegetables_warehouse) {
        /**
         * @description: the species this product factory product is apple and potato. And use previous products in previous warehouse to build new warehouse.
         *
         * @return : null
         **/
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
        return "class SpringProductFactory extends ProductFactory";
    }
}
