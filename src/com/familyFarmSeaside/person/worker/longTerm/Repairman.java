package com.familyFarmSeaside.person.worker.longTerm;

import com.familyFarmSeaside.person.owner.command.CommandWrapper;

import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: The maintenance worker of the farm
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Repairman extends LongTermWorker {
  private CommandWrapper logCommandWrapper;
  private CommandWrapper undoCommandWrapper;
  public Repairman(CommandWrapper logCommandWrapper, CommandWrapper undoCommandWrapper){
    this.logCommandWrapper = logCommandWrapper;
    this.undoCommandWrapper = undoCommandWrapper;
  }
  public void doSomeLog(){
    logCommandWrapper.execute();
  }

  public void undoLog(){
    undoCommandWrapper.execute();
  }
}
