package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Supply.Consumable.Consumable;
import main.java.com.familyFarmSeaside.Supply.Iterator.Iterator;
import main.java.com.familyFarmSeaside.Supply.Iterator.SupplyAggregate;
import main.java.com.familyFarmSeaside.Supply.Supply;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: Test the iterator pattern
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class IteratorTest
{
    public static void main(String[] args)
    {
        System.out.println("—————————————-------------------------------------———— Test[Iterator]Pattern —————————————-------------------------------------————");
        System.out.println("SupplyAggregate : getIterator() : Gets an iterator for an item created from the item's aggregation class.");
        System.out.println("Iterator : first() : Gets the first reasonable element.");
        System.out.println("Iterator : next() : Gets the next reasonable element.");
        System.out.println("Iterator : hasNext() : Determine if there is the next logical element.");
        System.out.println("");

        Date date = new Date();
        long m = date.getTime();
        SupplyAggregate supplyAggregate = new SupplyAggregate();
        supplyAggregate.add(new Consumable("肥料", new Date(m), 12, true, 2000f));
        supplyAggregate.add(new Consumable("饲料", new Date(m += 100000), 1, false, 4000f));
        supplyAggregate.add(new Consumable("水", new Date(m += 200000), 6, false, 6000f));
        Iterator supplyStorageIterator = supplyAggregate.getIterator();
        Supply supply = supplyStorageIterator.first();
        while (true)
        {
            System.out.println("名称：" + supply.getName() + "过期时间：" + supply.getExpirationDate().toString());
            if(supply instanceof Consumable)
            {
                System.out.println(((Consumable) supply).getStorage());
            }
            if(supplyStorageIterator.hasNext())
            {
                supply = supplyStorageIterator.next();
            }
            else
            {
                break;
            }
        }
    }
}