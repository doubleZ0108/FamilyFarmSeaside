package main.java.com.familyFarmSeaside.Watchdog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
/**
 * @program: FamilyFarmSeaside
 * @description: This is the basic need for a Watchdog.
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public interface Watchdog {
    void eat();
    void sleep();
    void setName(String name);
    String getName();

    void bark();        //Watchdog有别于狗的方法
}





