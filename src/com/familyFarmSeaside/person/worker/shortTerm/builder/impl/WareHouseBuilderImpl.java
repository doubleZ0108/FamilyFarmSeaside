package com.familyFarmSeaside.person.worker.shortTerm.builder.impl;

import com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;
import com.familyFarmSeaside.scene.warehouse.Warehouse;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The implementation of builder interface to build a warehouse.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class WareHouseBuilderImpl implements Builder {
  Warehouse warehouse;
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
    switch (plan){
      case "Warehouse": warehouse = new Warehouse();break;
      default: System.out.println("The type you choose is not currently supported!");break;
    }
  }


  @Override
  public void setDueDate(Date dueDate) {
    System.out.println("The project will be due on " + dueDate);
  }

  public Warehouse getResult() {
    return warehouse;
  }
}
