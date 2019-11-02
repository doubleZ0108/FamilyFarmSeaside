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
    System.out.println("--------------测试建造者模式---------------");
    ShortTermWorker shortTermWorker_1 = new BreedSceneBuilder();
    ShortTermWorker shortTermWorker_2 = new HouseBuilder();
    ShortTermWorker shortTermWorker_3 = new WarehouseBuilder();

    shortTermWorker_1.buildSomeThingNormal();
    shortTermWorker_2.buildSomeThingNormal();
    shortTermWorker_3.buildSomeThingNormal();
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
  }
}
