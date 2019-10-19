package com.familyFarmSeaside.person.worker.longTerm;

import java.util.List;
import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The man who buys resources for the farm.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Buyer extends LongTermWorker {
  Map<?,Integer> thingsToBuy;
  ResourceAdministrator resourceAdministrator;

  public double getBudget(Map<?, Integer> thingsToBuy){
    this.thingsToBuy = thingsToBuy;
    return 0;
  }

  public void buy(){

  }

  public void putToWarehouse(){
//    resourceAdministrator.putResources()
  }
}
