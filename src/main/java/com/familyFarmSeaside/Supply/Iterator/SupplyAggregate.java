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

    //向集合中添加元素
    @Override
    public void add(Supply supply)
    {
        supplies.add(supply);
    }

    //从集合中删除元素
    @Override
    public void remove(Supply supply)
    {
        supplies.remove(supply);
    }

    //返回一个复制了私有成员List的Iterator
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