package main.java.com.familyFarmSeaside.Animal;

import main.java.com.familyFarmSeaside.Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class of all Animal.
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Animal extends Product {
    static protected enum SpeciesName {MAMMALS,POULTRY,FISH}  //哺乳类 禽类 鱼类
    static protected enum Sex {MALE, FEMALE}                                   //雄性 雌性
    static public enum LifeStage {BABY, ADULT}                            //幼年体 成熟体

    protected SpeciesName species;                                                    //种类
    protected String detailedSpecies;                                                   //具体类别
    protected Sex sex;                                                                         //性别
    protected LifeStage lifestage;                                                        //生命阶段
    protected int age;      								                                   //年龄
    protected int hungerValue;  							                               //饥饿值(0~100) 0 -> 非常饿       【undo redo pattern】

    public Animal() {
        this.lifestage = LifeStage.BABY;
        this.age = 1;
        this.hungerValue=100;
        Random rand = new Random();
        if(rand.nextInt(2) + 0==1) {
            this.sex = Sex.MALE;
        }
        else {
            this.sex=Sex.FEMALE;
        }
    }

    public SpeciesName getSpecies(){return species;}
    public String getDetailedSpecies(){return detailedSpecies;}
    public  Sex getSex(){return sex;}
    public LifeStage getLifestage(){return lifestage;}
    public  int getAge(){return age;}
    public  int getHungerValue(){return  hungerValue;}
    public HashMap<String,String> getAnimalInfo(){
        HashMap<String,String> animalInfo = new HashMap<>();
        animalInfo.put("sex", getSex().toString());
        animalInfo.put("lifeStage", getLifestage().toString());
        animalInfo.put("value", String.valueOf(getSellValue()));
        animalInfo.put("hungerValue",String.valueOf(getHungerValue()));
        return animalInfo;
    }
    public void setAnimalInfo(HashMap<String,String> animalInfo){
        for (String key: animalInfo.keySet()){
            switch (key){
                case "sex":{
                    if (animalInfo.get(key).equals("MALE"))
                    {this.sex=Sex.MALE;}
                    else {this.sex=Sex.FEMALE;}
                    break;
                }
                case "lifeStage":{
                    if(animalInfo.get(key).equals("BABY")){
                        this.lifestage=LifeStage.BABY;
                    }
                    else {this.lifestage=LifeStage.ADULT;}
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }

    abstract public void eat();
    abstract public void sleep();
    abstract public void mating();  //交配
    abstract public Animal breed();   //繁殖
    public void grow(){
        this.lifestage = LifeStage.ADULT;
    }
}
