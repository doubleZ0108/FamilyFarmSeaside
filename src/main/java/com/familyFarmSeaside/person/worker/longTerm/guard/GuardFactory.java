package main.java.com.familyFarmSeaside.person.worker.longTerm.guard;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of guard
 * @author: saturn
 * @create: 2019/10/24
 **/
public class GuardFactory implements LongTermWorkerFactory {
    @Override
    public LongTermWorker newWorker() {
        System.out.println("New Guard instance created");
        return new Guard();
    }
}
