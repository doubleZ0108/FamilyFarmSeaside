package com.familyFarmSeaside.person.worker.longTerm.guard;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of guard
 * @author: saturn
 * @create: 2019/10/24
 **/
public class GuardFactory extends LongTermWorkerFactory {

    @Override
    protected LongTermWorker createWorker() {
        System.out.println("New Guard instance created");
        return new Guard();
    }
}
