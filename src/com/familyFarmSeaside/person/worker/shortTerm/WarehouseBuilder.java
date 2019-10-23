package com.familyFarmSeaside.person.worker.shortTerm;

import com.familyFarmSeaside.person.worker.shortTerm.ShortTermWorker;
import com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import com.familyFarmSeaside.person.worker.shortTerm.builder.impl.WareHouseBuilderImpl;
import com.familyFarmSeaside.scene.warehouse.Warehouse;

/**
 * @program: FamilyFarmSeaside
 * @description: The builder who can build warehouses.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class WarehouseBuilder extends ShortTermWorker {
  private WareHouseBuilderImpl builder = new WareHouseBuilderImpl();
  Warehouse warehouse;

  @Override
  public void buildSomeThingNormal(){
    Director director = new Director(builder);
    director.buildANormalScene();
    warehouse = builder.getResult();
  }

}
