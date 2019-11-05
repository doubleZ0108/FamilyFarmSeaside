package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.State.HarvestableState;
import main.java.com.familyFarmSeaside.Plant.State.MatureState;
import main.java.com.familyFarmSeaside.Plant.Strategy.ArtificialPollination;
import main.java.com.familyFarmSeaside.Plant.Strategy.PollinationStrategy;
import main.java.com.familyFarmSeaside.Plant.Strategy.SpontaneousPollination;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;

import java.util.ArrayList;

/**
 * @program: FamilyFarmSeaside
 * @description: Test for strategy pattern.
 * @author: Di Bu
 * @create: 2019/11/02
 **/
public class StrategyTest {
    /**
     * test for strategy
     * pollinate
     */

    public static ArrayList<Apple> appleList = new ArrayList<>(100);
    public static ArrayList<Cherry> cherryList = new ArrayList<>(100);
    public static ArrayList<Potato> potatoList = new ArrayList<>(100);
    public static ArrayList<Tomato> tomatoList = new ArrayList<>(100);


    /**
     * 􏱦􏱧􏱨Pistil􏰀􏱩􏰧􏱪􏱧􏱨 Stamen􏰀􏱩􏱏􏱖􏱫􏱬􏰧􏰟􏰠􏰡 􏱨PollinationMediator􏰀􏱩􏱭􏱡􏰘􏰙
     */

    public static void main(String[] args) {
        StrategyTest();
    }

    public static void StrategyTest() {
        Apple apple1 = new Apple();
        apple1.setPlantState(new MatureState());
        appleList.add(apple1);
        Cherry cherry1 = new Cherry();
        cherry1.setPlantState(new MatureState());
        cherryList.add(cherry1);
        Potato potato1 = new Potato();
        potato1.setPlantState(new MatureState());
        potatoList.add(potato1);
        Tomato tomato1 = new Tomato();
        tomato1.setPlantState(new MatureState());
        tomatoList.add(tomato1);



        System.out.println("\n\n-----------------Strategy Test------------------");
        System.out.println("Oops, those apples and potatoes need to be pollinated.");


        for (Apple item : appleList) {
            PollinationStrategy ps = new SpontaneousPollination(); /** Use of Strategy Pattern **/
            ps.pollinate(item); /** Use of Mediator Pattern **/
        }
        for (Cherry item : cherryList) {
            PollinationStrategy ps = new SpontaneousPollination(); /** Use of Strategy Pattern **/
            ps.pollinate(item); /** Use of Mediator Pattern **/
        }
        for(Potato item : potatoList){
            PollinationStrategy ps = new ArtificialPollination(); /** Use of Strategy Pattern **/
            ps.pollinate(item); /** Use of Mediator Pattern **/
        }
        for(Tomato item : tomatoList){
            PollinationStrategy ps = new ArtificialPollination(); /** Use of Strategy Pattern **/
            ps.pollinate(item); /** Use of Mediator Pattern **/
        }


        /** Use of State Pattern **/
        System.out.println("\nWe just pollinated those apples. Let's harvest them!");
        for (Apple item : appleList) {
            item.harvested();
        }
        System.out.println("\nWe just pollinated those cherries. Let's harvest them!");
        for (Cherry item : cherryList) {
            item.harvested();
        }
        System.out.println("\nWe just pollinated those potatoes. Let's harvest them!");
        for(Potato item : potatoList){
            item.harvested();
        }
        System.out.println("\nWe just pollinated those tomatoes. Let's harvest them!");
        for (Tomato item : tomatoList) {
            item.harvested();
        }
    }
}
