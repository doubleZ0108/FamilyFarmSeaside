package main.java.com.familyFarmSeaside.person.worker.shortTerm;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.Director;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.HouseBuilderImpl;
import main.java.com.familyFarmSeaside.scene.residence.Residence;

import java.util.UUID;

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

  public HouseBuilder(){}

  public HouseBuilder(HouseBuilderImpl builder, Residence residence) {
    this.builder = builder;
    this.residence = residence;
  }

  public HouseBuilder(String name, int age, double money, UUID id, HouseBuilderImpl builder, Residence residence) {
    super(name, age, money, id);
    this.builder = builder;
    this.residence = residence;
  }

  public HouseBuilderImpl getBuilder() {
    return builder;
  }

  public void setBuilder(HouseBuilderImpl builder) {
    this.builder = builder;
  }

  public Residence getResidence() {
    return residence;
  }

  public void setResidence(Residence residence) {
    this.residence = residence;
  }

  @Override
  public String toString() {
    return "class HouseBuilder extends ShortTermWorker";
  }
}
