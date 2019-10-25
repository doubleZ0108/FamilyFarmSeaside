package com.familyFarmSeaside.scene.residence.dormitory.furniture;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The abstract base class of furniture
 * @author: saturn
 * @create: 2019/10/24
 **/
abstract public class Furniture {
    public abstract void usedBy(LongTermWorker longTermWorker);
}
