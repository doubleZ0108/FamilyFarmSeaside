package com.familyFarmSeaside.person.worker.shortTerm;

import com.familyFarmSeaside.person.worker.Worker;
import com.familyFarmSeaside.scene.Scene;

import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The base of short term worker.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class ShortTermWorker extends Worker {
  public void build(Map<Scene,Integer> thingsToBuild){
    //使用 command
  }
}
