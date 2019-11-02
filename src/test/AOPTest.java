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
     /**
       * @description: to test AOP pattern, we have to have a main method
       *
       * @param args :
       *
       * @return : void
       **/
    System.out.println("—————————————-------------------------------------———— 测试[AOP]模式 —————————————-------------------------------------————");
    System.out.println("NormalConstruction : buildSomeThingNormal() : Abstract function of build something normal.");
    System.out.println("QualityAssuranceTeam : doConstructionUnderQA() : The quality assurance term Worker who belong to quality assurance team and want to do construction under QA. Create a proxy object. The user passes in the ShortTermWorker class object that needs to be proxied, and we will return a proxy object with the same interface. (The class to which the returned object belongs is created by the JVM at runtime)");
    System.out.println("SupplyTeam : doConstructionUnderQA() : The short term Worker who belong to quality assurance team and want to do construction under QA. Create a proxy object. The user passes in the ShortTermWorker class object that needs to be proxied, and we will return a proxy object with the same interface. (The class to which the returned object belongs is created by the JVM at runtime)。");
    System.out.println("");

    QualityAssuranceTeam qualityAssuranceTeam = new QualityAssuranceTeam();
    SupplyTeam supplyTeam = new SupplyTeam();
    // the random combination illustrated the advantages of the AOP pattern
    NormalConstruction QA_Breed = qualityAssuranceTeam.doConstructionUnderQA(new BreedSceneBuilder());
    NormalConstruction Supply_Warehouse = supplyTeam.doConstructionUnderQA(new WarehouseBuilder());
    QA_Breed.buildSomeThingNormal();
    System.out.println();
    Supply_Warehouse.buildSomeThingNormal();
    System.out.println();
    // we can add one more layer if you want
    QualityAssuranceTeam outer_qa = new QualityAssuranceTeam();
    NormalConstruction QA_Supply_Warehouse = outer_qa.doConstructionUnderQA(Supply_Warehouse);
    QA_Supply_Warehouse.buildSomeThingNormal();

    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
  }
}
