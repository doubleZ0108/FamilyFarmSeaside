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
    protected String fruit_species;         //specific fruit species
    protected String vegetable_species;     //specific vegetable species

    protected static Vector<Fruit> fruits_warehouse;            //warehouse for abstract fruits
    protected static Vector<Vegetable> vegetables_warehouse;    //warehouse for abstract vegetables

    public ProductFactory() {
        /**
         * @description: create an empty fruits warehouse and an empty vegetables warehouse
         *
         * @return : null
         **/
        fruits_warehouse = new Vector<Fruit>();
        vegetables_warehouse = new Vector<Vegetable>();
    }

    public ProductFactory(Vector<Fruit> store_fruits_warehouse, Vector<Vegetable> store_vegetables_warehouse){
        /**
         * @description: use previous products in previous warehouse to build new warehouse
         *
         * @param store_fruits_warehouse : previous fruits in previous warehouse
         * @param store_vegetables_warehouse : previous vegetables in previous warehouse
         *
         * @return : null
         **/
        fruits_warehouse = store_fruits_warehouse;
        vegetables_warehouse = store_vegetables_warehouse;
    }

    /*
    abstract create function
    because we don't know the specific fruit species and vegetable species
    the return type are most abstract -> Fruit & Vegetable
     */
    protected abstract Fruit createFruit();
    protected abstract Vegetable createVegetable();

    public void productFruit(){
        /**
         * @description: product abstract fruit and add it into fruits warehouse. The specific fruit will be declared in createFruit function.
         *
         * @return : void
         **/
        fruits_warehouse.add(createFruit());
    }

    public void productVegetable(){
        /**
         * @description: product abstract vegetable and add it into vegetables warehouse. The specific vegetable will be declared in createVegetable function.
         *
         * @return : void
         **/
        vegetables_warehouse.add(createVegetable());
    }

    public Vector<Fruit> getFruits_warehouse() {
        return fruits_warehouse;
    }

    public Vector<Vegetable> getVegetables_warehouse() {
        return vegetables_warehouse;
    }


    public void getWarehouse(){
        /**
         * @description: get all of the fruits and vegetables in this product factory
         *
         * @return : void
         **/
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

    public int getFruitsNum(){
        return fruits_warehouse.size();
    }

    public int getVegetablesNum(){
        return vegetables_warehouse.size();
    }

    @Override
    public String toString() {
        return "abstract class ProductFactory";
    }
}
