package test;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Watchdog.Adapter;
import main.java.com.familyFarmSeaside.Watchdog.Watchdog;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for Adapter Pattern
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public class AdapterTest {
    static  public  void testAdapter(String name) {
        System.out.println("创建一个对象watchdog...");
        Watchdog watchdog= new Adapter(new Dog());
        System.out.println("给watchdog取一个名字...");
        watchdog.setName(name);
        System.out.println("watchdog的名字是："+watchdog.getName());
        System.out.println(watchdog.getName()+"吃...");
        watchdog.eat();
        System.out.println(watchdog.getName()+"睡...");
        watchdog.sleep();
        System.out.println(watchdog.getName()+"吠...");
        watchdog.bark();
    }

    public static void main(String[] args) {
        testAdapter("popo");
    }
}