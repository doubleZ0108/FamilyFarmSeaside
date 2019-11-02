package test;

import java.util.Scanner;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.BreedSceneBuilder;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.HouseBuilder;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.ShortTermWorker;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.WarehouseBuilder;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.BreedSceneBuilderImpl;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for builder method
 * @author: Zijian Zhang
 * @create: 2019/10/25
 **/
public class BuilderTest {
  public static void main(String[] args){
     /**
       * @description: To test Builder pattern, we have to have a main method
       *
       * @param args :
       *
       * @return : void
       **/
    System.out.println("—————————————-------------------------------------———— 测试[Builder]模式 —————————————-------------------------------------————");
    System.out.println("ShortTermWorker : buildSomeThingNormal() : Defined in the Director class. After the constructor gets the concrete Builder class, Director can further simplify the use by constructing the building according to a set of pre-defined default steps.");
    System.out.println("BreedSceneBuilder : BreedSceneBuilder() : Use the same set of construct interfaces to create many different objects. Farms, fish ponds and shacks for farming.");
    System.out.println("HouseBuilder : HouseBuilder() : Use the same set of construct interfaces to create many different objects. Worker's quarters for accommodation and farmer's villa.");
    System.out.println("WarehouseBuilder : WarehouseBuilder() : Use the same set of construct interfaces to create many different objects. Warehouse for storing materials.");
    System.out.println("");
    // new three shortTermWorker who have the director object inside their buildSomeThingNormal() method
    ShortTermWorker shortTermWorker_1 = new BreedSceneBuilder();
    ShortTermWorker shortTermWorker_2 = new HouseBuilder();
    ShortTermWorker shortTermWorker_3 = new WarehouseBuilder();
    // director is invoked
    // this is done in order to show the convience brought by the usage of director
    shortTermWorker_1.buildSomeThingNormal();
    shortTermWorker_2.buildSomeThingNormal();
    shortTermWorker_3.buildSomeThingNormal();
    // in order to let the uesr have a better experience
    // we add some interactive part
    System.out.println("假设此时准备建造一个养殖场，请你进行一下选择：");
    BreedSceneBuilderImpl breedSceneBuilderImpl = new BreedSceneBuilderImpl();
    Scanner scanner = new Scanner(System.in);
    while(breedSceneBuilderImpl.getBreedScene()==null){
      System.out.println("请选择建造计划:(Farmland, FishPond,LivestockFarm)");
      breedSceneBuilderImpl.setBuildingPlan(scanner.nextLine());
    }
    System.out.println("请输入建造地点:");
    breedSceneBuilderImpl.setLocation(scanner.nextLine());
    System.out.println("--------------------------------------");

    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
  }
}
