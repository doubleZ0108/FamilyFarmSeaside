package main.java.com.familyFarmSeaside.Watchdog;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;

/**
 * @program: FamilyFarmSeaside
 * @description: Adapter Pattern to implement Watchdog's eat and sleep function
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public class Adapter implements Watchdog{
    private Dog adaptee;    //适配者：Dog，适配Dog类的eat 和 sleep 功能
    private String name;

    public void eat(){
        this.adaptee.eat();
    }

    public void sleep(){
        this.adaptee.sleep();
    }

    @Override
    public void bark() {
        System.out.println("Watchdog: bark...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Adapter(){
    }

    public Adapter(Dog adaptee){
        this.adaptee=adaptee;
    }

    public Dog getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Dog adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String toString() {
        return "class Adapter implements Watchdog";
    }
}