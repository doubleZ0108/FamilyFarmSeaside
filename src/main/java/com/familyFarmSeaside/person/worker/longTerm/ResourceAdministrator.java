package main.java.com.familyFarmSeaside.person.worker.longTerm;

import main.java.com.familyFarmSeaside.person.owner.command.CommandWrapper;
import main.java.com.familyFarmSeaside.scene.warehouse.Warehouse;

import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The administrator of resources.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class ResourceAdministrator extends LongTermWorker {
  private Warehouse warehouse;
  private CommandWrapper resourceLogCommand;
  private CommandWrapper undoCommand;

  public ResourceAdministrator(CommandWrapper resourceLogCommand,CommandWrapper undoCommand){
    this.resourceLogCommand = resourceLogCommand;
    this.undoCommand = undoCommand;
  }
  public void doSomeLog(){
    resourceLogCommand.execute();
  }
  public void undoLog(){
    undoCommand.execute();
  }

  public void addResources(Map<?, Integer> thingsToAdd){

  }

  public void minusResources(Map<?, Integer> thingsToMinus){

  }
}
