package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Supply.Consumable.Consumable;
import main.java.com.familyFarmSeaside.Supply.Observer.FeedObserver;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: Test the observer pattern.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class ObserverTest
{
    public static void main(String[] args)
    {
        System.out.println("—————————————-------------------------------------———— Test[Observer]Pattern —————————————-------------------------------------————");

        System.out.println("Consumable : Consumable() : Inherited from Supply, create an instance of consumable.");
        System.out.println("Consumable : addObserver() : Inherited from Supply, add an observer to consumable.");
        System.out.println("Consumable : consume() : Inherited from Supply, consume this consumable.");
        System.out.println("FeedObserver : FeedObserver() : Implements Observer, create an instance of FeedObserver");
        System.out.println("");



        Consumable feed = new Consumable("肥料", new Date(), 12, true, 2000f);
        feed.addObserver(new FeedObserver(500f));
        feed.consume(1600f);

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}