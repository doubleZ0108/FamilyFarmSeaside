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
  private double cost; //造价
  private String location;//位置

  public void setLocation(String location){
    this.location = location;
  }

  public Scene(){}

  public Scene(double cost) {
    this.cost = cost;
  }

  public Scene(double cost, String location) {
    this.cost = cost;
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


  Map<?, List<?>> container;
  // <放的东西的类型可用 enum ，该类东西的列表 >

}
// 增删改查
