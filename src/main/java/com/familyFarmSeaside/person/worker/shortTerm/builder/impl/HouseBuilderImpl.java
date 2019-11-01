package main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl;

import main.java.com.familyFarmSeaside.scene.residence.ReceptionCenter;
import main.java.com.familyFarmSeaside.scene.residence.Residence;
import main.java.com.familyFarmSeaside.scene.residence.Villa;
import main.java.com.familyFarmSeaside.scene.residence.dormitory.Dormitory;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;

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

  public HouseBuilderImpl(){
  }

  public HouseBuilderImpl(Residence residence) {
    this.residence = residence;
  }

  public Residence getResidence() {
    return residence;
  }

  public void setResidence(Residence residence) {
    this.residence = residence;
  }

  @Override
  public String toString() {
    return "class HouseBuilderImpl implements Builder";
  }
}
