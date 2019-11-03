package test.DesignPatternTest;

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
     /**
       * @description: in order to test the IOC pattern, we have to use a main method
       *
       * @param args :
       *
       * @return : void
       **/
    // please note that the IOC pattern we implement here is not complete!
    // Only a IOC container is implemented!
    // the full IOC pattern still requires a dependency injection
    // but it is too hard to implement
    System.out.println("—————————————-------------------------------------———— Test[IOC]Pattern —————————————-------------------------------------————");
    System.out.println("ClassPathXmlApplicationContext : ClassPathXmlApplicationContext() : ClassPathXmlApplicationContext constructors, accept parameters is used to construct the object of the path of the XML file. After accepting the argument, this function will read the contents of the XML file through the StAX interface, thereby constructing the corresponding object in its own Set.");
    System.out.println("ClassPathXmlApplicationContext :  getBean() : In the XML definition, the user needs to specify the appropriate object ID, which is passed in as a parameter when this function is called.");
    System.out.println("");

    System.out.println("Loading config XML from src/main/java/com/familyFarmSeaside/person/worker/shortTerm/ioc/warehouseConfig.xml");
    System.out.println("Every object defined in the file will be instantiated. They are listed as bellow");
    System.out.println();
    // we will create a new classPathXmlApplicationContext using the specifig XML file.
    try {
      ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("src/main/java/com/familyFarmSeaside/person/worker/shortTerm/ioc/warehouseConfig.xml");
      Warehouse warehouse = (Warehouse)classPathXmlApplicationContext.getBean("warehouse_1");
      warehouse.displayIOCInfo();
      System.out.println();
      // we can get the object we created by their IDs
      warehouse = (Warehouse)classPathXmlApplicationContext.getBean("warehouse_2");
      warehouse.displayIOCInfo();
      System.out.println("If you want to try this function by yourself, you can go to the path mentioned above and take a look at the comment!");
    }catch (Exception exception){
      System.out.println("The file path is not correct");
    }

    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
  }
}
