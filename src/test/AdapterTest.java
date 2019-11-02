package test;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Dog;
import main.java.com.familyFarmSeaside.Watchdog.Adapter;
import main.java.com.familyFarmSeaside.Watchdog.Watchdog;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for Adapter Pattern
 * @author: Yu Liu
 * @create: 2019/10/28
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----适配器模式测试----");
        System.out.println("创建一个对象watchdog...");
        Watchdog watchdog= new Adapter(new Dog());
        System.out.println("给watchdog取一个名字...");
        String name = scanner.nextLine();
        watchdog.setName(name);
        System.out.println("watchdog的名字是："+watchdog.getName());
        System.out.println(watchdog.getName()+"吃...");
        watchdog.eat();
        System.out.println(watchdog.getName()+"睡...");
        watchdog.sleep();
        System.out.println(watchdog.getName()+"吠...");
        watchdog.bark();
    }
}