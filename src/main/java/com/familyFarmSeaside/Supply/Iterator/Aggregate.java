package main.java.com.familyFarmSeaside.Supply.Iterator;

import main.java.com.familyFarmSeaside.Supply.Supply;

/**
 * @program: FamilyFarmSeaside
 * @description: The interface claims the method getIterator(), the class which implements this interface can be traversed.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public interface Aggregate
{
    public void add(Supply supply);

    public void remove(Supply supply);

    public Iterator getIterator();
}
