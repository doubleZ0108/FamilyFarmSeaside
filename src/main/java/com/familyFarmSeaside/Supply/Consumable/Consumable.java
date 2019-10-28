package main.java.com.familyFarmSeaside.Supply.Consumable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import main.java.com.familyFarmSeaside.Supply.Observer.Observer;
import main.java.com.familyFarmSeaside.Supply.Supply;

/**
 * @program: DesignPatterns
 * @description: All consumable supplies
 * @author: Yifan Ye
 * @create: 2019/10/22
 **/
public class Consumable extends Supply
{
    private boolean poisoned;
    private float storage; //grams
    private List<Observer> observers = new ArrayList<Observer>();

    public Consumable()
    {
        System.out.println("No Para Consumable");
    }

    public Consumable(String n, Date d, int v, boolean p, float s)
    {
        super(n, d, v);
        poisoned = p;
        storage = s;
    }

    public boolean getPoisoned()
    {
        return poisoned;
    }

    public void consume(float s)
    {
        if(s > storage)
        {
            System.out.println("Too much");
        }
        else
        {
            storage -= s;
            for(Observer ob : observers)
            {
                ob.response(storage);
            }
        }
    }

    public float getStorage()
    {
        return storage;
    }

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
}
