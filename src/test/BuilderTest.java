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
    ShortTermWorker shortTermWorker_1 = new BreedSceneBuilder();
    ShortTermWorker shortTermWorker_2 = new HouseBuilder();
    ShortTermWorker shortTermWorker_3 = new WarehouseBuilder();

    shortTermWorker_1.buildSomeThingNormal();
    shortTermWorker_2.buildSomeThingNormal();
    shortTermWorker_3.buildSomeThingNormal();

    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
  }
}
