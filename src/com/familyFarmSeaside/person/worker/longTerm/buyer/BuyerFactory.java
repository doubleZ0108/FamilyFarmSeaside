package com.familyFarmSeaside.person.worker.longTerm.buyer;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.person.worker.longTerm.LongTermWorkerFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: The factory class of buyer
 * @author: saturn
 * @create: 2019/10/24
 **/
public class BuyerFactory extends LongTermWorkerFactory {
    @Override
    protected LongTermWorker createWorker() {
        return new Buyer();
    }
}
