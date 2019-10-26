package main.java.com.familyFarmSeaside.person.worker.longTerm;

import main.java.com.familyFarmSeaside.person.worker.Worker;

/**
 * @program: FamilyFarmSeaside
 * @description: The base of all long term worker.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class LongTermWorker extends Worker {
  public static enum WokerType{
    AnimalCul, CropCul, Buyer, DormAdmi, Guard, Repaire, ResourceAdmi
  };

  private WokerType wokerType;
  private int dormNumber;
  private int roomNo;
  private int workerID;

  public int getDormNumber() {
    return dormNumber;
  }
  public void setDormNumber(int dormNumber) {
    this.dormNumber = dormNumber;
  }
  public int getWorkerID() { return workerID; }
  public void setWorkerID(int id){workerID = id;}
  public WokerType getWokerType() {
    return wokerType;
  }

  public void getUp(){
    System.out.println("第"+workerID+"号员工起床了");
  }
  public void goToSleep(){
    System.out.println("第"+workerID+"号员工睡觉了");
  }



}
