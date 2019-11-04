package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Strategy.ArtificialPollination;
import main.java.com.familyFarmSeaside.Plant.Strategy.PollinationStrategy;
import main.java.com.familyFarmSeaside.Plant.Strategy.SpontaneousPollination;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;

import java.util.ArrayList;

/**
 * @program: FamilyFarmSeaside
 * @description: Test for strategy pattern.
 * @author: Di Bu
 * @create: 2019/11/02
 **/
public class StrategyTest {
    /**
     * test for mediator
     * pollinate
     */

    public static ArrayList<Apple> appleList = new ArrayList<>(100);
    public static ArrayList<Potato> potatoList = new ArrayList<>(100);


    /**
     * 􏱦􏱧􏱨Pistil􏰀􏱩􏰧􏱪􏱧􏱨 Stamen􏰀􏱩􏱏􏱖􏱫􏱬􏰧􏰟􏰠􏰡 􏱨PollinationMediator􏰀􏱩􏱭􏱡􏰘􏰙
     */

    public static void StrategyTest() {
        System.out.println("\n\n-----------------Mediator in Plant------------------");
        System.out.println("Oops, those apples and potatoes need to be pollinated.");


        for (Apple item : appleList) {
            PollinationStrategy ps = new SpontaneousPollination(); /** Use of Strategy Pattern **/
            ps.pollinate(item); /** Use of Mediator Pattern **/
        }
        for(Potato item : potatoList){
            PollinationStrategy ps = new ArtificialPollination(); /** Use of Strategy Pattern **/
            ps.pollinate(item); /** Use of Mediator Pattern **/
        }


        /** Use of State Pattern **/
        System.out.println("\nWe just pollinated those corns. Let's harvest them!");
        for (Apple item : appleList) {
            item.harvested();
        }
        for(Potato item : potatoList){
            item.harvested();
        }
    }
}
