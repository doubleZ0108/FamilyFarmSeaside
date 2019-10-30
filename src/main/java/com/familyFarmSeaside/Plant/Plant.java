package main.java.com.familyFarmSeaside.Plant;

import main.java.com.familyFarmSeaside.Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Plant extends Product {

    static public enum LifeStage {GROWTH, BREEDING, MATURE};  //生长期 繁殖期 成熟期
    static protected enum SpeciesName {FRUIT,VEGETABLE}  //水果 蔬菜

    protected LifeStage lifestage;      //生命阶段
    protected SpeciesName species;  //种类
    protected String detailedSpecies;//具体种类
    protected int nutritionValue;   //营养值

    public Plant(){
        super();
        this.lifestage=LifeStage.GROWTH;
        this.nutritionValue=100;
    }

    public LifeStage getLifestage(){ return lifestage; }
    public String getDetailedSpecies() { return detailedSpecies; }
    public  int getNutritionValue(){return nutritionValue;}
    public HashMap<String,String > getPlantInfo(){
        HashMap<String,String> plantInfo = new HashMap<>();
        plantInfo.put("lifeStage", getLifestage().toString());
        plantInfo.put("value", String.valueOf(getSellValue()));
        plantInfo.put("nutritionValue", String.valueOf(getNutritionValue()));
        return plantInfo;
    }

    public void setPlantInfo(HashMap<String,String> plantInfo){
        for (String key: plantInfo.keySet()){
            switch (key){
                case "lifeStage":{
                    if(plantInfo.get(key).equals("GROWTH")){
                        this.lifestage=LifeStage.GROWTH;
                    }
                    else {this.lifestage=LifeStage.MATURE;}
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
    public  void grow1(){this.lifestage=LifeStage.BREEDING;}
    public  void grow2(){this.lifestage=LifeStage.MATURE;}
}
