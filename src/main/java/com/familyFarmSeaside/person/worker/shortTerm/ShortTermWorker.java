package main.java.com.familyFarmSeaside.person.worker.shortTerm;

import main.java.com.familyFarmSeaside.person.worker.Worker;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;

/**
 * @program: FamilyFarmSeaside
 * @description: The base of short term worker.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class ShortTermWorker extends Worker implements NormalConstruction {
//  public void buildSomeThingNormal(){}

  public static void main(String[] args){
    ShortTermWorker shortTermWorker_1 = new BreedSceneBuilder();
    ShortTermWorker shortTermWorker_2 = new HouseBuilder();
    ShortTermWorker shortTermWorker_3 = new WarehouseBuilder();

    shortTermWorker_1.buildSomeThingNormal();
    shortTermWorker_2.buildSomeThingNormal();
    shortTermWorker_3.buildSomeThingNormal();
  }
}
