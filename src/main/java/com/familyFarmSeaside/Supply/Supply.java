package main.java.com.familyFarmSeaside.Supply;
import java.util.Date;

/**
 * @program: DesignPatterns
 * @description: The parent class of all supplies
 * @author: Yifan Ye
 * @create: 2019/10/21
 **/
public class Supply {
    protected String name;
    protected Date date_of_production;
    protected  int validity;//months

    public Supply()
    {
        System.out.println("No Para Supply");
    }

    public Supply(String s, Date d, int v)
    {
        name = s;
        date_of_production = d;
        validity = v;
    }

    public String getName()
    {
        return name;
    }

    public Date getExpirationDate()
    {
        long millisec = date_of_production.getTime();
        millisec += validity * 30 * 86400;
        return new Date(millisec);
    }
}