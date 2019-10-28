package main.java.com.familyFarmSeaside.Supply.Iterator;

import main.java.com.familyFarmSeaside.Supply.Supply;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: You can think this class as a warehouse, all supplies can be stored in this class.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class SupplyAggregate implements Aggregate
{
    private List<Supply> supplies = null;

    public SupplyAggregate()
    {
        supplies = new ArrayList<Supply>();
    }

    @Override
    public void add(Supply supply)
    {
        supplies.add(supply);
    }

    @Override
    public void remove(Supply supply)
    {
        supplies.remove(supply);
    }

    @Override
    public Iterator getIterator()
    {
        return new SupplyStorageIterator(supplies);
    }
}