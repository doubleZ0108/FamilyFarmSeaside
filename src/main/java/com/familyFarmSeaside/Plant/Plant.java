package main.java.com.familyFarmSeaside.Plant;

import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.Flower;
import main.java.com.familyFarmSeaside.Plant.State.*;
import main.java.com.familyFarmSeaside.Product.Product;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @program: FamilyFarmSeaside
 * @description: plant
 * @author: Di
 * @create: 2019/10/28
 **/
public abstract class Plant extends Product {
    protected int nutritionValue;   //营养值

    /**
     * the flower of the plant;
     */
    public Flower flower;

    /**
     * Plant's state
     */
    public PlantState plantState = null;

    /**
     * Plant's type
     */
    private String plantType;

    public Plant(){
    }

    /**
     * Constructor
     * @param type plant's type
     */
    public Plant(String type) {
        this.plantType = type;
        this.setPlantState(new GrowingState());
    }

    /**
     * get plant's type
     * @return plant's type
     */
    public String getPlantType() {
        return plantType;
    }

    public  int getNutritionValue(){
        return nutritionValue;
    }

    /**
     * see that state the plant is
     */
    public void currentState() {
        System.out.println("The " + this.getPlantType() + " is now " + this.getPlantState());
    }

    /**
     * fertilize the plant
     */
    public void fertilized(){
        if(this.isGrowing()) {
            this.plantState.moveToNext(this);
        }else if(this.isMature()) {
            System.out.println("This mature " + this.getPlantType() +" needs to be pollinated. Stop fertilizing it.");
        }else if(this.isHarvestable()) {
            System.out.println("This " + this.getPlantType() +" is now harvestable. Stop fertilizing it.");
        }else if(this.isDead()){

        }
    }


    /**
     * harvest the plant
     * abstract
     */
    //abstract public void harvested();

    /**
     * get plant's state
     * @return plant's state
     */
    public String getPlantState() {
        return this.plantState.getStateName();
    }

    /**
     * set plant's life stage
     *  ls plant's new life stage
     */
    public void setPlantState(PlantState ps) {
        this.plantState = ps;
    }

    /**
     * check whether the plant is growing
     * @return whether the plant is growing
     */
    public boolean isGrowing() {
        return (this.getPlantState() == "Growing");
    }

    /**
     * check whether the plant is mature
     * @return whether the plant is mature
     */
    public boolean isMature() {
        return (this.getPlantState() == "Mature");
    }

    /**
     * check whether the plant is harvestable
     * @return whether the plant is harvestable
     */
    public boolean isHarvestable() {
        return (this.getPlantState() == "Harvestable");
    }

    /**
     * check whether the plant is dead
     * @return whether the plant is dead
     */
    public boolean isDead() {
        return (this.getPlantState() == "Dead");
    }

    public HashMap<String,String > getPlantInfo(){
        HashMap<String,String> plantInfo = new HashMap<>();
        plantInfo.put("plantState", getPlantState());
        plantInfo.put("value", String.valueOf(getSellValue()));
        plantInfo.put("nutritionValue", String.valueOf(getNutritionValue()));
        return plantInfo;
    }

    public void setPlantInfo(HashMap<String,String> plantInfo){
        for (String key: plantInfo.keySet()){
            switch (key){
                case "plantState":{
                    if(plantInfo.get(key).equals("Growing")){
                        this.plantState=new GrowingState();
                    }
                    else if(plantInfo.get(key).equals("MatureState")){
                        this.plantState=new MatureState();
                    }
                    else if(plantInfo.get(key).equals("HarvestableState")){
                        this.plantState=new HarvestableState();
                    }
                    else {this.plantState=new DeadState();}

                    break;
                }
                default:{
                    break;
                }
            }
        }
    }

}