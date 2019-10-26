package com.familyFarmSeaside.person.owner.command.concreteCommand;

import com.familyFarmSeaside.person.owner.FarmOwner;
import com.familyFarmSeaside.person.owner.command.Command;

/**
 * @program: FamilyFarmSeaside
 * @description: Undo the previous command.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class UndoCommand extends Command {
  public UndoCommand(FarmOwner farmOwner) {
    super(farmOwner);
  }

  @Override
  public boolean execute() {
    farmOwner.undoCommand();
    return false;
  }
}
