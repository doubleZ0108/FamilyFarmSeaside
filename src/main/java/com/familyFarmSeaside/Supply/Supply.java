package main.java.com.familyFarmSeaside.Supply;
import main.java.com.familyFarmSeaside.Supply.Visitor.SupplyVisitor;

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

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_of_production() {
        return date_of_production;
    }

    public void setDate_of_production(Date date_of_production) {
        this.date_of_production = date_of_production;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "class Supply";
    }
}