package main.java.com.familyFarmSeaside.person.owner.command.concreteCommand;

import main.java.com.familyFarmSeaside.person.owner.FarmOwner;
import main.java.com.familyFarmSeaside.person.owner.command.Command;

import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The command for repairman to execute.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class ResourceLogCommand extends Command {
  public ResourceLogCommand(FarmOwner farmOwner) {
    super(farmOwner);
  }

  @Override
  public boolean execute() {
    backUp();
    String old = previousLog;
    Date now = new Date();
    old = old + "[LOG]I am a resource administrator. My duty is to manage all kinds of resources. Now is " + now.getHours() + ":" + now.getMinutes()+":"+now.getSeconds() + "\n";
    farmOwner.setLogFile(old);
    return true;
  }

  @Override
  public String toString() {
    return "class ResourceLogCommand extends Command";
  }
}
