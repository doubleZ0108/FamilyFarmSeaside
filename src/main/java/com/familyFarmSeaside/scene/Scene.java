package main.java.com.familyFarmSeaside.scene;

import java.util.List;
import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The base scene of the farm
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class Scene {
  private double cost;        //cost of this scene yuan/m^2
  private String location;    //location of this scene


  public Scene(){}

  public Scene(double cost) {
    this.cost = cost;
  }

  public Scene(double cost, String location) {
    this.cost = cost;
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location){
    this.location = location;
  }

  public double getCost()
  {
    return cost;
  };

  public void setCost(double d)
  {
    cost = d;
  }

}
