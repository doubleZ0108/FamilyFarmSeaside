package com.familyFarmSeaside.person.worker.shortTerm.builder.impl;

import com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;
import com.familyFarmSeaside.scene.residence.Dormitory;
import com.familyFarmSeaside.scene.residence.ReceptionCenter;
import com.familyFarmSeaside.scene.residence.Residence;
import com.familyFarmSeaside.scene.residence.Villa;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: To implement the builder interface as a house builder.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class HouseBuilderImpl implements Builder {
  private Residence residence;
  @Override
  public void reset() {
    System.out.println("The residence builder is reset!");
    residence = null;
  }

  @Override
  public void setLocation(String location) {
    if(residence != null) {
      System.out.println("The residence will be built in " + location);
      residence.setLocation(location);
      return;
    }
    System.out.println("Please set the building plan first!");
  }

  @Override
  public void setBuildingPlan(String plan) {
    System.out.println("Builder: You choose the type of " + plan);
    switch (plan){
      case "Dormitory": residence = new Dormitory();break;
      case "ReceptionCenter": residence = new ReceptionCenter();break;
      case "Villa": residence = new Villa();break;
      default: System.out.println("The type you choose is not currently supported!");break;
    }
  }


  @Override
  public void setDueDate(Date dueDate) {
    System.out.println("The project will be due on " + dueDate);
  }

  public Residence getResult() {
    return residence;
  }
}
