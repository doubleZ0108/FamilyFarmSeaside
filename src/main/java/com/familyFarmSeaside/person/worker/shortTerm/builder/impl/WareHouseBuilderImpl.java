package main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl;

import main.java.com.familyFarmSeaside.scene.warehouse.Warehouse;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The implementation of builder interface to build a warehouse.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class WareHouseBuilderImpl implements Builder {
  private Warehouse warehouse;

  @Override
  public void reset() {
    System.out.println("The warehouse builder is reset!");
    warehouse = null;
  }

  @Override
  public void setLocation(String location) {
    if(warehouse != null) {
      System.out.println("The warehouse will be built in " + location);
      warehouse.setLocation(location);
      return;
    }
    System.out.println("Please set the building plan first!");
  }

  @Override
  public void setBuildingPlan(String plan) {
    System.out.println("Builder: You choose the type of " + plan);
    if ("Warehouse".equals(plan)) {
      warehouse = new Warehouse();
    } else {
      System.out.println("The type you choose is not currently supported!");
    }
  }


  @Override
  public void setDueDate(Date dueDate) {
    System.out.println("The project will be due on " + dueDate);
  }

  public Warehouse getResult() {
    return warehouse;
  }

  public WareHouseBuilderImpl(){
  }

  public WareHouseBuilderImpl(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  public Warehouse getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public String toString() {
    return "class WareHouseBuilderImpl implements Builder";
  }
}
