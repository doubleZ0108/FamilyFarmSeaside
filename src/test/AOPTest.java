package test;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.*;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.QualityAssuranceTeam;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.SupplyTeam;

/**
 * @program: FamilyFarmSeaside
 * @description: To test AOP pattern.
 * @author: Zijian Zhang
 * @create: 2019/10/27
 **/
public class AOPTest {
  public static void main(String[] args){
    System.out.println("——————————————————测试AOP模式————————————————————");
    QualityAssuranceTeam qualityAssuranceTeam = new QualityAssuranceTeam();
    SupplyTeam supplyTeam = new SupplyTeam();
    // 这样随意的组合可以体现 AOP 的优势，只需要把公共任务抽象出来，套到另外主要业务逻辑外面就可以了
    NormalConstruction QA_Breed = qualityAssuranceTeam.doConstructionUnderQA(new BreedSceneBuilder());
    NormalConstruction Supply_Warehouse = supplyTeam.doConstructionUnderQA(new WarehouseBuilder());
    QA_Breed.buildSomeThingNormal();
    System.out.println();
    Supply_Warehouse.buildSomeThingNormal();
    System.out.println();
    // 还能再套一层
    QualityAssuranceTeam outer_qa = new QualityAssuranceTeam();
    NormalConstruction QA_Supply_Warehouse = outer_qa.doConstructionUnderQA(Supply_Warehouse);
    QA_Supply_Warehouse.buildSomeThingNormal();
    System.out.println("--------------------------------------------------");
  }
}
