package com.familyFarmSeaside.person.worker.shortTerm;

import com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import com.familyFarmSeaside.person.worker.shortTerm.builder.impl.HouseBuilderImpl;
import com.familyFarmSeaside.scene.residence.Residence;

/**
 * @program: FamilyFarmSeaside
 * @description: The man who build the houses.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class HouseBuilder extends ShortTermWorker {
  private HouseBuilderImpl builder = new HouseBuilderImpl();
  private Residence residence;

  @Override
  public void buildSomeThingNormal() {
    Director director = new Director(builder);
    director.buildANormalScene();
    residence = builder.getResult();
  }

}
