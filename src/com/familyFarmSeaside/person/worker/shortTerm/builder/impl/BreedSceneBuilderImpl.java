package com.familyFarmSeaside.person.worker.shortTerm.builder.impl;

import com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;
import com.familyFarmSeaside.scene.breedScene.BreedScene;
import com.familyFarmSeaside.scene.breedScene.Farmland;
import com.familyFarmSeaside.scene.breedScene.FishPond;
import com.familyFarmSeaside.scene.breedScene.LivestockFarm;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The implementation of Builder interface of a pond builder class.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class BreedSceneBuilderImpl implements Builder {
  private BreedScene breedScene;
  @Override
  public void reset() {
    System.out.println("The breedScene builder is reset!");
    breedScene = null;
  }

  @Override
  public void setLocation(String location) {
    if(breedScene != null) {
      System.out.println("The breedScene will be built in " + location);
      breedScene.setLocation(location);
      return;
    }
    System.out.println("Please set the building plan first!");
  }

  @Override
  public void setBuildingPlan(String plan) {
    System.out.println("Builder: You choose the type of " + plan);
    switch (plan){
      case "Farmland": breedScene = new Farmland();break;
      case "FishPond": breedScene = new FishPond();break;
      case "LivestockFarm": breedScene = new LivestockFarm();break;
      default: System.out.println("The type you choose is not currently supported!");break;
    }
//    System.out.println(breedScene.getClass());
  }


  @Override
  public void setDueDate(Date dueDate) {
    System.out.println("The project will be due on " + dueDate);
  }

  public BreedScene getResult() {
    return breedScene;
  }
}
