package com.familyFarmSeaside.scene;

import com.familyFarmSeaside.scene.residence.Dormitory;
import com.familyFarmSeaside.scene.residence.Residence;
import com.familyFarmSeaside.scene.residence.decorator.Bed;
import com.familyFarmSeaside.scene.residence.decorator.Chair;
import com.familyFarmSeaside.scene.residence.decorator.Desk;

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

  public Scene(){}
  public Scene(double x){
    cost = x;
  }
  public double getCost()
  {
    return cost;
  };
  public void setCost(double d)
  {
    cost = d;
  }

  public static void main(String[] args){

    //测试decorator设计模式
    Residence dorm = new Dormitory();
    System.out.println(dorm.getCost());
    dorm = new Bed(dorm);
    System.out.println(dorm.getCost());
    dorm = new Desk(dorm);
    System.out.println(dorm.getCost());
    dorm = new Desk(dorm);
    System.out.println(dorm.getCost());
    dorm = new Chair(dorm);
    System.out.println(dorm.getCost());
  }

  Map<?, List<?>> container;
  // <放的东西的类型可用 enum ，该类东西的列表 >

}
// 增删改查
