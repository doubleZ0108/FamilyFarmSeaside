package com.familyFarmSeaside.scene.residence;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: The house for workers.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Dormitory extends Residence {
  public Dormitory(){
    super(20000);
  }
  public int getDormNumber(){
    return dormNumber;
  }
  public List<LongTermWorker> getLongTermWorkers(){
    return longTermWorkers;
  }

  @Override
  public String getDescription() {
    return "这是一栋宿舍";
  }

  private int dormNumber;
  private List<LongTermWorker> longTermWorkers;
}
