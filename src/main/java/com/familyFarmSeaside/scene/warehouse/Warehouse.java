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

  // this constructor has to be kept in order to perform IOC
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
       * @description: To show for the IOC pattern
       *

       *
       * @return : void
       **/
    System.out.println("Warehouse info:");
    System.out.println("cost: " + cost);
    System.out.println("floorNumber: " + floorNumber);
    System.out.println("name: " + name);
  }

  public Warehouse(double cost, int floorNumber, String name) {
    this.cost = cost;
    this.floorNumber = floorNumber;
    this.name = name;
  }

  public Warehouse(double cost, double cost1, int floorNumber, String name) {
    super(cost);
    this.cost = cost1;
    this.floorNumber = floorNumber;
    this.name = name;
  }

  public Warehouse(double cost, String location, double cost1, int floorNumber, String name) {
    super(cost, location);
    this.cost = cost1;
    this.floorNumber = floorNumber;
    this.name = name;
  }

  @Override
  public double getCost() {
    return cost;
  }

  public int getFloorNumber() {
    return floorNumber;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "class Warehouse extends Scene";
  }
}
