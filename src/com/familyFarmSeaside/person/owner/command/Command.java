package com.familyFarmSeaside.person.owner.command;

import com.familyFarmSeaside.person.owner.FarmOwner;

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


}
