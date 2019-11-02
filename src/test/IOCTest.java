package test;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.ioc.ClassPathXmlApplicationContext;
import main.java.com.familyFarmSeaside.scene.warehouse.Warehouse;

/**
 * @program: FamilyFarmSeaside
 * @description: To test IOC pattern
 * @author: Zijian Zhang
 * @create: 2019/10/27
 **/
public class IOCTest {
  public static void main(String[] args){
    System.out.println("——————————————————测试IOC模式————————————————————");
    System.out.println("Loading config XML from src/main/java/com/com.familyFarmSeaside/person/worker/shortTerm/ioc/warehouseConfig.xml");
    System.out.println("Every object defined in the file will be instantiated. They are listed as bellow");
    System.out.println();
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("src/main/java/com/com.familyFarmSeaside/person/worker/shortTerm/ioc/warehouseConfig.xml");
    Warehouse warehouse = (Warehouse)classPathXmlApplicationContext.getBean("warehouse_1");
    warehouse.displayIOCInfo();
    System.out.println();
    warehouse = (Warehouse)classPathXmlApplicationContext.getBean("warehouse_2");
    warehouse.displayIOCInfo();
    System.out.println("--------------------------------------------------");
  }
}
