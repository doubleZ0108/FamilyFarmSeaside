package com.familyFarmSeaside.person.worker.longTerm.repairman;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;
import com.familyFarmSeaside.person.worker.longTerm.guard.Guard;

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
