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
    static protected enum SpeciesName {MAMMALS,POULTRY,FISH}  //Mammalian poultry
    static protected enum Sex {MALE, FEMALE}                  //Male Female
    static public enum LifeStage {BABY, ADULT}                //Juvenile Body

    protected SpeciesName species;                            //species
    protected String detailedSpecies;                         //detailed species
    protected Sex sex;                                        //gender
    protected LifeStage lifestage;                            //life stage
    protected int age;      								  //age
    protected int hungerValue;  							  //Hunger value (0~100) 0 -> very hungry

    public Animal() {
        /**
         * @description: randomly generate an animal
         *
         * @return : null
         **/
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

    public Animal(int sellValue, int buyValue, SpeciesName species, String detailedSpecies, Sex sex, LifeStage lifestage, int age, int hungerValue) {
        super(sellValue, buyValue);
        this.species = species;
        this.detailedSpecies = detailedSpecies;
        this.sex = sex;
        this.lifestage = lifestage;
        this.age = age;
        this.hungerValue = hungerValue;
    }

    /* common behavior of animals */
    public void grow(){
        this.lifestage = LifeStage.ADULT;
    }

    abstract public void eat();

    abstract public void sleep();

    abstract public void mating();

    abstract public Animal breed();



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


    public SpeciesName getSpecies(){return species;}

    public String getDetailedSpecies(){return detailedSpecies;}

    public  Sex getSex(){return sex;}

    public LifeStage getLifestage(){return lifestage;}

    public  int getAge(){return age;}

    public  int getHungerValue(){return  hungerValue;}

    public void setSpecies(SpeciesName species) {
        this.species = species;
    }

    public void setDetailedSpecies(String detailedSpecies) {
        this.detailedSpecies = detailedSpecies;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setLifestage(LifeStage lifestage) {
        this.lifestage = lifestage;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungerValue(int hungerValue) {
        this.hungerValue = hungerValue;
    }

    @Override
    public String toString() {
        return "abstract class Animal extends Product";
    }
}
