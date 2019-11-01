package main.java.com.familyFarmSeaside.Supply.Observer;

/**
 * @program: FamilyFarmSeaside
 * @description: Observe the storage of feed.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class FeedObserver implements Observer
{
    private float dead_line;

    public  FeedObserver()
    {
        dead_line = 0;
    }

    public FeedObserver(float f)
    {
        dead_line = f;
    }

    @Override
    public void response(float f)
    {
        if(f < dead_line)
        {
            System.out.println("存量为" + f + "小于危险存量");
        }
    }

    public float getDead_line() {
        return dead_line;
    }

    public void setDead_line(float dead_line) {
        this.dead_line = dead_line;
    }

    @Override
    public String toString() {
        return "class FeedObserver implements Observer";
    }
}