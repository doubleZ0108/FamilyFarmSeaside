package com.familyFarmSeaside.person.owner;

import com.familyFarmSeaside.person.Person;
import com.familyFarmSeaside.person.visitor.Customer;
import com.familyFarmSeaside.person.visitor.Traveller;
import com.familyFarmSeaside.person.worker.Worker;
import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.scene.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The owner of the farm.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class FarmOwner extends Person {
  private Map<LongTermWorker.WokerType, Double> salaryTable;
//  private List<LongTermWorker> longTermWorkers = new ArrayList<>();
  private Map<LongTermWorker.WokerType, List<LongTermWorker>> longTermWorkers ;

  public void hire(LongTermWorker.WokerType wokerType){
    //longTermWorkers.add(new )

  }

  private LongTermWorker getLongTermWorkerOfAType(LongTermWorker.WokerType wokerType){
    return null;
  }

  public void giveSalary(){
//    for (LongTermWorker l :
//      longTermWorkers) {
//      double salary = salaryTable.get(l.getWokerType());
//      l.addMoney(salary);
//      minusMoney(salary);
//    }
  }

  public void changeSalary(LongTermWorker.WokerType wokerType, double newSalary){

  }

  public void buyResources(Map<?,Integer> thingsToBuy){
    // double budget =  buyer.getBudget(thingsToBuy)
    // buyer.add
    // minus
    // buyer.buy()
  }

  public void welcomeTraveller(List<Traveller> travellers){

  }

  public void welcomeCustomer(List<Customer> customers){

  }

  public void buildBuilding(Map<Scene,Integer> tobeBuilt){

  }

}
