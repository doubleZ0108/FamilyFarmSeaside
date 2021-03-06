package main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl;

import main.java.com.familyFarmSeaside.scene.breedScene.BreedScene;
import main.java.com.familyFarmSeaside.scene.breedScene.Farmland;
import main.java.com.familyFarmSeaside.scene.breedScene.FishPond;
import main.java.com.familyFarmSeaside.scene.breedScene.LivestockFarm;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;

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

  public BreedSceneBuilderImpl(){
  }

  public BreedSceneBuilderImpl(BreedScene breedScene) {
    this.breedScene = breedScene;
  }

  public BreedScene getBreedScene() {
    return breedScene;
  }

  public void setBreedScene(BreedScene breedScene) {
    this.breedScene = breedScene;
  }

  @Override
  public String toString() {
    return "class BreedSceneBuilderImpl implements Builder";
  }
}
