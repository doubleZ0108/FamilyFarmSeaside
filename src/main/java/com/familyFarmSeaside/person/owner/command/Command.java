package main.java.com.familyFarmSeaside.person.owner.command;

import main.java.com.familyFarmSeaside.person.owner.FarmOwner;

/**
 * @program: FamilyFarmSeaside
 * @description: The command base class.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public abstract class Command {
  protected FarmOwner farmOwner;
  protected String previousLog;

  public abstract boolean execute();
  public Command(FarmOwner farmOwner){
    this.farmOwner = farmOwner;
  }
  protected void backUp(){
    previousLog = farmOwner.getLogFile();
  }

  public void unDo(){
    farmOwner.setLogFile(previousLog);
  }

  public Command(FarmOwner farmOwner, String previousLog) {
    this.farmOwner = farmOwner;
    this.previousLog = previousLog;
  }

  public FarmOwner getFarmOwner() {
    return farmOwner;
  }

  public void setFarmOwner(FarmOwner farmOwner) {
    this.farmOwner = farmOwner;
  }

  public String getPreviousLog() {
    return previousLog;
  }

  public void setPreviousLog(String previousLog) {
    this.previousLog = previousLog;
  }

  @Override
  public String toString() {
    return "abstract class Command";
  }
}
