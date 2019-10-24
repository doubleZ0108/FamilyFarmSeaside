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
public class ResidenceLogCommand extends Command {
  public ResidenceLogCommand(FarmOwner farmOwner) {
    super(farmOwner);
  }

  @Override
  public boolean execute() {
    backUp();
    String old = previousLog;
    Date now = new Date();
    old = old + "[LOG]I am a residence administrator. My duty is to manage the dormitory. Now is "+ now.getHours() + ":" + now.getMinutes()+":"+now.getSeconds() + "\n";
    farmOwner.setLogFile(old);
    return true;
  }
}
