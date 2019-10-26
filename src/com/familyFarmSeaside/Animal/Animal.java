package com.familyFarmSeaside.Animal;

import com.familyFarmSeaside.Product.Product;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class of all Animal.
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Animal extends Product {
    static protected enum SpeciesName {MAMMALS,POULTRY,FISH};  //哺乳类 禽类 鱼类
    static protected enum Sex {MALE, FEMAIL};                  //雄性 雌性
    static protected enum LifeStage {BABY, ADULT};             //幼年体 成熟体

    protected SpeciesName species;                             //种类
    protected String detailedSpecies;                          //具体类别
    protected Sex sex;                                         //性别
    protected LifeStage lifestage;                             //生命阶段

    protected int age;      //年龄
    protected int hungerValue;  //饥饿值(0~100) 0 -> 非常饿       【undo redo pattern】

    public Animal() {
        this.lifestage = LifeStage.BABY;
        this.age = 1;
    }

    abstract public void eat();
    abstract public void sleep();
    abstract public void mating();  //交配
    abstract public void breed();   //繁殖
    public void grow(){
        this.lifestage = LifeStage.ADULT;
    }

    public String getDetailedSpecies() { return this.detailedSpecies; }
}
