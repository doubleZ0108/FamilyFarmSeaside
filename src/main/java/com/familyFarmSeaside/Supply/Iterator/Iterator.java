package main.java.com.familyFarmSeaside.Supply.Iterator;

import main.java.com.familyFarmSeaside.Supply.Supply;

/**
 * @program: FamilyFarmSeaside
 * @description:All iterators should implement this interface so that they can be iterators.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public interface Iterator
{
    public Supply first();

    public Supply next();

    public boolean hasNext();
}
