package com.familyFarmSeaside.test;

import com.familyFarmSeaside.person.worker.longTerm.buyer.Buyer;
import com.familyFarmSeaside.person.worker.longTerm.buyer.BuyerFactory;
import com.familyFarmSeaside.person.worker.longTerm.guard.Guard;
import com.familyFarmSeaside.person.worker.longTerm.guard.GuardFactory;
import com.familyFarmSeaside.person.worker.longTerm.repairman.Repairman;
import com.familyFarmSeaside.person.worker.longTerm.repairman.RepairmanFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for factory method
 * @author: saturn
 * @create: 2019/10/25
 **/
public class FactoryMethodTest {
    public static void main(String[] args){
        System.out.println("------------测试工厂方法模式------------");
        Repairman repairman = (Repairman) new RepairmanFactory().newWorker();
        Buyer buyer = (Buyer) new BuyerFactory().newWorker();
        Guard guard = (Guard) new GuardFactory().newWorker();
        System.out.println("---------------------------------");

    }
}
