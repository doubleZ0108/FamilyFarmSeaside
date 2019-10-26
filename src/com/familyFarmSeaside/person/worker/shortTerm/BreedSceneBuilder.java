package com.familyFarmSeaside.person.worker.shortTerm;

import com.familyFarmSeaside.person.worker.shortTerm.builder.Builder;
import com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import com.familyFarmSeaside.person.worker.shortTerm.builder.impl.BreedSceneBuilderImpl;
import com.familyFarmSeaside.scene.breedScene.BreedScene;

/**
 * @program: FamilyFarmSeaside
 * @description: The man who build the ponds.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class BreedSceneBuilder extends ShortTermWorker {
  private BreedSceneBuilderImpl builder = new BreedSceneBuilderImpl();
  private BreedScene breedScene;
  @Override
  public void buildSomeThingNormal(){
    Director director = new Director(builder);
    director.buildANormalScene();
    breedScene = builder.getResult();
  }
}
