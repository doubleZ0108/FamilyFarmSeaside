package main.java.com.familyFarmSeaside.person.worker.longTerm.cultivator;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: The man who cultivate animals or plans.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class Cultivator extends LongTermWorker {
  private List<?> creatureList;

  public List<?> getCreatureList() {
    return creatureList;
  }

  public void setCreatureList(List<?> creatureList) {
    this.creatureList = creatureList;
  }

  public void dailyWork(){
    addCreature();
    raiseCreature();
    killCreature();
  }

  public abstract void addCreature();// Add plants and animals
  public abstract void raiseCreature(); //Breeding plants and animals,(Therapeutic plant and animal）
  public abstract void killCreature(); //Harvest plant and animal



}
