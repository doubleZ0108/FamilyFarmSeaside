package main.java.com.familyFarmSeaside.person.worker.shortTerm;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.WareHouseBuilderImpl;
import main.java.com.familyFarmSeaside.scene.warehouse.Warehouse;

/**
 * @program: FamilyFarmSeaside
 * @description: The builder who can build warehouses.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class WarehouseBuilder extends ShortTermWorker implements NormalConstruction {
  private WareHouseBuilderImpl builder = new WareHouseBuilderImpl();
  private Warehouse warehouse;

  public WarehouseBuilder(){
  }

  public WarehouseBuilder(WareHouseBuilderImpl builder, Warehouse warehouse) {
    this.builder = builder;
    this.warehouse = warehouse;
  }

  @Override
  public void buildSomeThingNormal(){
    /**
     * @description: Warehouse for storing materials.
     *
     * @return : void
     **/
    Director director = new Director(builder);
    director.buildANormalScene();
    warehouse = builder.getResult();
  }

  public WareHouseBuilderImpl getBuilder() {
    return builder;
  }

  public void setBuilder(WareHouseBuilderImpl builder) {
    this.builder = builder;
  }

  public Warehouse getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
  }

  @Override
  public String toString() {
    return "class WarehouseBuilder extends ShortTermWorker implements NormalConstruction";
  }
}
