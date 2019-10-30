package main.java.com.familyFarmSeaside.Product;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Perch;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: all product
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public class ProductList {
    public List<Chicken> chickenList=new ArrayList<>();
    public List<Dog>dogList=new ArrayList<>();
    public List<Perch>perchList=new ArrayList<>();

    public List<Apple>appleList=new ArrayList<>();
    public List<Cherry>cherryList=new ArrayList<>();
    public List<Potato>potatoList=new ArrayList<>();
    public List<Tomato>tomatoList=new ArrayList<>();

    public HashMap<String , List<HashMap<String,String >>> getProductInfo(){
        HashMap<String , List<HashMap<String,String >>>  info = new HashMap<>();
        List<HashMap<String,String >>chickenInfo = new ArrayList<>();
        for (Chicken chicken: chickenList){
            chickenInfo.add(chicken.getAnimalInfo());
        }
        info.put("Chicken", chickenInfo);

        List<HashMap<String,String >>dogInfo = new ArrayList<>();
        for (Dog dog: dogList){
            dogInfo.add(dog.getAnimalInfo());
        }
        info.put("Dog", dogInfo);

        List<HashMap<String,String >>perchInfo = new ArrayList<>();
        for (Perch perch: perchList){
            perchInfo.add(perch.getAnimalInfo());
        }
        info.put("Perch", perchInfo);

        List<HashMap<String,String >>appleInfo = new ArrayList<>();
        for (Apple apple: appleList){
            appleInfo.add(apple.getPlantInfo());
        }
        info.put("Apple", appleInfo);

        List<HashMap<String,String >>cherryInfo = new ArrayList<>();
        for (Cherry cherry: cherryList){
            cherryInfo.add(cherry.getPlantInfo());
        }
        info.put("Cherry", cherryInfo);

        List<HashMap<String,String >>potatoInfo = new ArrayList<>();
        for (Potato potato: potatoList){
            potatoInfo.add(potato.getPlantInfo());
        }
        info.put("Potato", potatoInfo);

        List<HashMap<String,String >>tomatoInfo = new ArrayList<>();
        for (Tomato tomato: tomatoList){
            tomatoInfo.add(tomato.getPlantInfo());
        }
        info.put("Tomato", tomatoInfo);
        return info;
    }

    public void printProductInfo(){
        for (String key1: this.getProductInfo().keySet()){
            System.out.println(key1+ "：\n " );
            List<HashMap<String,String >> value1 = this.getProductInfo().get(key1);
            int i=0;
            int number = 0;
            for(HashMap<String ,String> productHashMap: value1){
                System.out.println("ID："+i+" ");
                for (String key2: productHashMap.keySet()){
                    String value2 = productHashMap.get(key2);
                    if(key2.equals("lifeStage")&&(value2.equals("MATURE")||value2.equals("ADULT")))
                    {number++;}
                    System.out.println(key2 + "： " + value2+" ");
                }
                i++;
            }
            System.out.println("theNumberCanBeSold："+number);
            System.out.println("\n");
        }
    }
}
