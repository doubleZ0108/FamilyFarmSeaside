package main.java.com.familyFarmSeaside.person.worker.longTerm.buyer;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of buyer
 * @author: saturn
 * @create: 2019/10/24
 **/
public class BuyerFactory implements LongTermWorkerFactory {
    @Override
    public LongTermWorker newWorker() {
        System.out.println("New Buyer instance created");
        return new Buyer();
    }
}
