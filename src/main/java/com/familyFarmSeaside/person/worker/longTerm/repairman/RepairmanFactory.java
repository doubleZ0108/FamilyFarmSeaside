package main.java.com.familyFarmSeaside.person.worker.longTerm.repairman;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of repairman
 * @author: saturn
 * @create: 2019/10/24
 **/
public class RepairmanFactory implements LongTermWorkerFactory {

    @Override
    public LongTermWorker newWorker() {
        System.out.println("New Guard instance created");
        return new Repairman();
    }
}
