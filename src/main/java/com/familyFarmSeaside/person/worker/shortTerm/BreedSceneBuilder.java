package main.java.com.familyFarmSeaside.person.worker.shortTerm;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.BreedSceneBuilderImpl;
import main.java.com.familyFarmSeaside.scene.breedScene.BreedScene;

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
}
