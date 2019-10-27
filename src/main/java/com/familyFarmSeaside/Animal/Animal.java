package main.java.com.familyFarmSeaside.Animal;

import main.java.com.familyFarmSeaside.Product.Product;

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
    static protected enum LifeStage {BABY, ADULT}                            //幼年体 成熟体

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

    abstract  public SpeciesName getSpecies();
    abstract  public String getDetailedSpecies();
    abstract  public  Sex getSex();
    abstract  public LifeStage getLifestage();
    abstract  public  int getAge();
    abstract  public  int getHungerValue();

    abstract public void eat();
    abstract public void sleep();
    abstract public void mating();  //交配
    abstract public Animal breed();   //繁殖
    public void grow(){
        this.lifestage = LifeStage.ADULT;
    }
}
