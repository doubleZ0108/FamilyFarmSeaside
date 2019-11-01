package main.java.com.familyFarmSeaside.person.worker.shortTerm;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.BreedSceneBuilderImpl;
import main.java.com.familyFarmSeaside.scene.breedScene.BreedScene;

import java.util.UUID;

/**
 * @program: FamilyFarmSeaside
 * @description: The man who build the ponds.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class BreedSceneBuilder extends ShortTermWorker implements NormalConstruction {
  private BreedSceneBuilderImpl builder = new BreedSceneBuilderImpl();
  private BreedScene breedScene;
  @Override
  public void buildSomeThingNormal(){
    Director director = new Director(builder);
    director.buildANormalScene();
    breedScene = builder.getResult();
  }

  public BreedSceneBuilder(BreedSceneBuilderImpl builder, BreedScene breedScene) {
    this.builder = builder;
    this.breedScene = breedScene;
  }

  public BreedSceneBuilder(String name, int age, double money, UUID id, BreedSceneBuilderImpl builder, BreedScene breedScene) {
    super(name, age, money, id);
    this.builder = builder;
    this.breedScene = breedScene;
  }

  public BreedSceneBuilderImpl getBuilder() {
    return builder;
  }

  public void setBuilder(BreedSceneBuilderImpl builder) {
    this.builder = builder;
  }

  public BreedScene getBreedScene() {
    return breedScene;
  }

  public void setBreedScene(BreedScene breedScene) {
    this.breedScene = breedScene;
  }

  @Override
  public String toString() {
    return "class BreedSceneBuilder extends ShortTermWorker implements NormalConstruction";
  }
}
