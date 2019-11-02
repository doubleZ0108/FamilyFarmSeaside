package test;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.BreedSceneBuilder;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.HouseBuilder;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.ShortTermWorker;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.WarehouseBuilder;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for builder method
 * @author: Zijian Zhang
 * @create: 2019/10/25
 **/
public class BuilderTest {
  public static void main(String[] args){
    System.out.println("—————————————-------------------------------------———— 测试[Builder]模式 —————————————-------------------------------------————");
    System.out.println("ShortTermWorker : buildSomeThingNormal() : Defined in the Director class. After the constructor gets the concrete Builder class, Director can further simplify the use by constructing the building according to a set of pre-defined default steps.");
    System.out.println("BreedSceneBuilder : BreedSceneBuilder() : Use the same set of construct interfaces to create many different objects. Farms, fish ponds and shacks for farming.");
    System.out.println("HouseBuilder : HouseBuilder() : Use the same set of construct interfaces to create many different objects. Worker's quarters for accommodation and farmer's villa.");
    System.out.println("WarehouseBuilder : WarehouseBuilder() : Use the same set of construct interfaces to create many different objects. Warehouse for storing materials.");
    System.out.println("");

    ShortTermWorker shortTermWorker_1 = new BreedSceneBuilder();
    ShortTermWorker shortTermWorker_2 = new HouseBuilder();
    ShortTermWorker shortTermWorker_3 = new WarehouseBuilder();

    shortTermWorker_1.buildSomeThingNormal();
    shortTermWorker_2.buildSomeThingNormal();
    shortTermWorker_3.buildSomeThingNormal();

    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
  }
}
