package main.java.com.familyFarmSeaside.Product.Factory;

import main.java.com.familyFarmSeaside.Plant.Fruit.Fruit;
import main.java.com.familyFarmSeaside.Plant.Vegetable.Vegetable;
import main.java.com.familyFarmSeaside.Product.Product;

import java.util.Vector;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class of product factory.
 * @author: Zhe Zhang
 * @create: 2019/10/28
 **/
public abstract class ProductFactory {
    protected String fruit_species;
    protected String vegetable_species;

    protected static Vector<Fruit> fruits_warehouse;
    protected static Vector<Vegetable> vegetables_warehouse;


    protected abstract Fruit createFruit();
    protected abstract Vegetable createVegetable();

    public ProductFactory() {
        fruits_warehouse = new Vector<Fruit>();
        vegetables_warehouse = new Vector<Vegetable>();
    }

    public ProductFactory(Vector<Fruit> store_fruits_warehouse, Vector<Vegetable> store_vegetables_warehouse){
        fruits_warehouse = store_fruits_warehouse;
        vegetables_warehouse = store_vegetables_warehouse;
    }

    public Vector<Fruit> getFruits_warehouse() {
        return fruits_warehouse;
    }

    public Vector<Vegetable> getVegetables_warehouse() {
        return vegetables_warehouse;
    }

    public void productFruit(){
        fruits_warehouse.add(createFruit());
    }

    public void productVegetable(){
        vegetables_warehouse.add(createVegetable());
    }

    public int getFruitsNum(){
        return fruits_warehouse.size();
    }

    public int getVegetablesNum(){
        return vegetables_warehouse.size();
    }

    public void getWarehouse(){
        System.out.println("");
        System.out.println("===== Fruits in " + this.toString() + " ==============");
        getFruits();
        System.out.println("===== Vegetables in " + this.toString() + " ==============");
        getVegetables();
        System.out.println("");
    }

    private void getFruits(){
        for(Fruit fruit : fruits_warehouse){
            System.out.println(fruit);
        }
    }

    private void getVegetables(){
        for(Vegetable vegetable : vegetables_warehouse){
            System.out.println(vegetable);
        }
    }

    public String getFruit_species() {
        return fruit_species;
    }

    public String getVegetable_species() {
        return vegetable_species;
    }
}
