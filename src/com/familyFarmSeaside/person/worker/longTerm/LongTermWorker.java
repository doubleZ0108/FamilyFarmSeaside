package com.familyFarmSeaside.person.worker.longTerm;

import com.familyFarmSeaside.person.worker.Worker;

/**
 * @program: FamilyFarmSeaside
 * @description: The base of all long term worker.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class LongTermWorker extends Worker {
  private WokerType wokerType;

  public int getDormNumber() {
    return dormNumber;
  }

  public void setDormNumber(int dormNumber) {
    this.dormNumber = dormNumber;
  }

  private int dormNumber;


  public static enum WokerType{
    AnimalCul, CropCul, Buyer, DormAdmi, Guard, Repaire, ResourceAdmi
  };

  public WokerType getWokerType() {
    return wokerType;
  }

  public void goToSleep(){
    System.out.println("I am going to #" + dormNumber);
  }



}
