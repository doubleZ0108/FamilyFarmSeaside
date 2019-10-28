package main.java.com.familyFarmSeaside.Watchdog;
import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
/**
 * @program: FamilyFarmSeaside
 * @description: This is a Singleton Watchdog
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public interface Watchdog {

//    private String name;
//    private int hungerValue;
//    private int healthValue;
    void eat();
    void sleep();
    void setName(String name);
    String getName();
}





