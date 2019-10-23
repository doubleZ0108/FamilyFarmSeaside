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

  List<LongTermWorker> longTermWorkers;
}
