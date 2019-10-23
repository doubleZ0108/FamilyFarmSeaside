package com.familyFarmSeaside.person.owner.command.concreteCommand;

import com.familyFarmSeaside.person.owner.FarmOwner;
import com.familyFarmSeaside.person.owner.command.Command;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The command for repairman to execute.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class RepairemanLogCommand extends Command {
  public RepairemanLogCommand(FarmOwner farmOwner) {
    super(farmOwner);
  }

  @Override
  public boolean execute() {
    backUp();
    String old = previousLog;
    Date now = new Date();
    old = old + "[LOG]I am a repairman. My duty is to repair all kinds of tools. Now is " + now.getHours() + ":" + now.getMinutes()+":"+now.getSeconds() + "\n";
    farmOwner.setLogFile(old);
    return true;
  }
}
