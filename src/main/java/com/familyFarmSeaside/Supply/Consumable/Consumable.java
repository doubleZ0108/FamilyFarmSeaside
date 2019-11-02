package main.java.com.familyFarmSeaside.Supply.Consumable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import main.java.com.familyFarmSeaside.Supply.Observer.Observer;
import main.java.com.familyFarmSeaside.Supply.Supply;
import main.java.com.familyFarmSeaside.Supply.Element;
import main.java.com.familyFarmSeaside.Supply.Visitor.SupplyVisitor;

/**
 * @program: DesignPatterns
 * @description: All consumable supplies
 * @author: Yifan Ye
 * @create: 2019/10/22
 **/
public class Consumable extends Supply implements Element
{
    private boolean poisoned;
    private float storage; //grams
    private List<Observer> observers = new ArrayList<Observer>();

    //观察者模式所使用的accept方法，接收一个Visitor
    @Override
    public void accept(SupplyVisitor visitor) {
        visitor.visitConsumable(this);
    }

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

    //消耗指定数量，触发观察者
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

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }

    public void setStorage(float storage) {
        this.storage = storage;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public String toString() {
        return "class Consumable extends Supply implements Element";
    }
}
