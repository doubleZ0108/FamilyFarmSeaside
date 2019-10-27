package main.java.com.familyFarmSeaside.scene.warehouse;

import main.java.com.familyFarmSeaside.scene.Scene;

/**
 * @program: FamilyFarmSeaside
 * @description: The warehouse in the farm.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Warehouse extends Scene {
  private double cost;
  private int floorNumber;
  private String name;

  // 这个无参构造函数一定保留，对于 IOC 不可或缺
  public Warehouse(){}


  @Override
  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void displayIOCInfo(){
     /**
       * @description: IOC 展示使用，cost，floorNumber，name 属性将从配置文件中读取。
       *

       *
       * @return : void
       **/
    System.out.println("Warehouse info:");
    System.out.println("cost: " + cost);
    System.out.println("floorNumber: " + floorNumber);
    System.out.println("name: " + name);
  }
}
