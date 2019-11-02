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

    void bark();        //The method Watchdog different from basic dog.
}





