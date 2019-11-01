package main.java.com.familyFarmSeaside.Supply.Iterator;

import main.java.com.familyFarmSeaside.Supply.Supply;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: You can traverse all the supplies in SupplyAggregate.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class SupplyStorageIterator implements Iterator
{
    private List<Supply> supplies = null;
    private int index = -1;
    private float dead_line = 0;

    public SupplyStorageIterator()
    {
        supplies = new ArrayList<Supply>();
    }

    public SupplyStorageIterator(List<Supply> supplies)
    {
        this.supplies = supplies;
    }

    public void setDeadline(float dead_line) {
        this.dead_line = dead_line;
    }

    @Override
    public Supply first() {
        index = 0;
        return supplies.get(index);
    }

    @Override
    public Supply next() {
        if(this.hasNext())
        {
            return supplies.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if(index < supplies.size() - 1)
        {
            return true;
        }
        return false;
    }

    public Supply last()
    {
        index = supplies.size() - 1;
        return supplies.get(index);
    }

    public Supply previous()
    {
        return supplies.get(--index);
    }

    public List<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(List<Supply> supplies) {
        this.supplies = supplies;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public float getDead_line() {
        return dead_line;
    }

    public void setDead_line(float dead_line) {
        this.dead_line = dead_line;
    }

    @Override
    public String toString() {
        return "class SupplyStorageIterator implements Iterator";
    }
}