package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.person.worker.longTerm.buyer.Buyer;
import main.java.com.familyFarmSeaside.person.worker.longTerm.buyer.BuyerFactory;
import main.java.com.familyFarmSeaside.person.worker.longTerm.guard.Guard;
import main.java.com.familyFarmSeaside.person.worker.longTerm.guard.GuardFactory;
import main.java.com.familyFarmSeaside.person.worker.longTerm.repairman.Repairman;
import main.java.com.familyFarmSeaside.person.worker.longTerm.repairman.RepairmanFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for factory method
 * @author: saturn
 * @create: 2019/10/25
 **/
public class FactoryMethodTest {
    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— Test[Factory Method]Pattern —————————————-------------------------------------————");
        System.out.println("LongTermWorker : newWorker() : " +
                "The abstract method of the factory parent class, the implementation of which is determined by the specific factory subclass that creates the specific LongTermWorker object.");
        System.out.println("");
        Repairman repairman = (Repairman) new RepairmanFactory().newWorker();
        Buyer buyer = (Buyer) new BuyerFactory().newWorker();
        Guard guard = (Guard) new GuardFactory().newWorker();
        System.out.println("---------------------------------");
    }
}
