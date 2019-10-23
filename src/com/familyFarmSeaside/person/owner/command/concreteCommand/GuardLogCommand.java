package com.familyFarmSeaside.person.owner.command.concreteCommand;

import com.familyFarmSeaside.person.owner.FarmOwner;
import com.familyFarmSeaside.person.owner.command.Command;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The command for guard to execute.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class GuardLogCommand extends Command {
  public GuardLogCommand(FarmOwner farmOwner) {
    super(farmOwner);
  }

  @Override
  public boolean execute() {
    backUp();
    String old = previousLog;
    Date now = new Date();
    old = old + "[LOG]I am a Guard. My duty is to protect our farm from invasion. Now is "+ now.getHours() + ":" + now.getMinutes()+":"+now.getSeconds() + "\n";
    farmOwner.setLogFile(old);
    return true;
  }
}
