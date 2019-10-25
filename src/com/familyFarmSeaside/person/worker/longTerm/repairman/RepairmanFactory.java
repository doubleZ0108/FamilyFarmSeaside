package com.familyFarmSeaside.person.worker.longTerm.repairman;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of repairman
 * @author: saturn
 * @create: 2019/10/24
 **/
public class RepairmanFactory extends LongTermWorkerFactory {

    @Override
    protected LongTermWorker createWorker() {
        System.out.println("New Repairman instance created.");
        return new Repairman();
    }
}
