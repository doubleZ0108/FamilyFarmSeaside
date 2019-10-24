package com.familyFarmSeaside.person.worker.longTerm;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of long term worker
 * @author: saturn
 * @create: 2019/10/24
 **/
abstract public class LongTermWorkerFactory {
    public LongTermWorker newWorker(){
        /**
         * @description: return a long term worker instance according to concrete factory
         *
         *
         * @return : com.familyFarmSeaside.person.Person
         **/
        return createWorker();
    }

    abstract protected LongTermWorker createWorker();
}
