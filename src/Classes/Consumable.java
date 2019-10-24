package Classes;
import java.util.Date;

/**
 * @program: DesignPatterns
 * @description: All consumable supplies
 * @author: Yifan Ye
 * @create: 2019/10/22
 **/
public class Consumable extends  Supply
{
    protected boolean poisoned;
    protected float storage; //grams

    Consumable()
    {
        System.out.println("No Para Consumable");
    }


    Consumable(String n, Date d, int v, boolean p, float s)
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
        }
    }

    public float getStorage()
    {
        return storage;
    }
}