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

    //Add an element to a collection
    @Override
    public void add(Supply supply)
    {
        supplies.add(supply);
    }

    //Remove an element from a collection
    @Override
    public void remove(Supply supply)
    {
        supplies.remove(supply);
    }

    //Returns an Iterator that copies a private member List
    @Override
    public Iterator getIterator()
    {
        return new SupplyStorageIterator(supplies);
    }

    public List<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    @Override
    public String toString() {
        return "class SupplyAggregate implements Aggregate";
    }
}