package test;

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
        Consumable feed = new Consumable("肥料", new Date(), 12, true, 2000f);
        feed.addObserver(new FeedObserver(500f));
        feed.consume(1600f);
    }
}