package test.DesignPatternTest;

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
        System.out.println("—————————————-------------------------------------———— Test[Adapter]Pattern —————————————-------------------------------------————");
        System.out.println("Adapter : eat() : Use adapter to implement eat function in Watchdog.");
        System.out.println("Adapter : sleep() : Use adapter to implement sleep function in Watchdog.");
        System.out.println("Adapter : bark() : Use adapter to implement bark function in Watchdog.");
        System.out.println("Dog : eat() : Abstract eat function in dog base class.");
        System.out.println("Dog : sleep() : Abstract sleep function in dog base class.");
        System.out.println("Dog : bark() : Abstract bark function in dog base class.");
        System.out.println("Watchdog : eat() : Interface that watchdog should have eat function.");
        System.out.println("Watchdog : sleep() : Interface that watchdog should have sleep function.");
        System.out.println("Watchdog : bark() : Interface that watchdog should have bark function.");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
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

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}