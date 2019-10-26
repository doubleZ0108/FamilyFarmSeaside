package com.familyFarmSeaside.person.owner.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: FamilyFarmSeaside
 * @description: The container for previous commands.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class CommandHistory {
  private List<Command> commands = new ArrayList<>();
  public void addCommand(Command command){
    commands.add(command);
  }
  public Command popCommand(){
    if(!commands.isEmpty()){
      return commands.remove(commands.size()-1);
    }
    return null;
  }
}
