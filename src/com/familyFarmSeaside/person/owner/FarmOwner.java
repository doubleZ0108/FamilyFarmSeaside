package com.familyFarmSeaside.person.owner;

import com.familyFarmSeaside.person.Person;
import com.familyFarmSeaside.person.owner.command.Command;
import com.familyFarmSeaside.person.owner.command.CommandHistory;
import com.familyFarmSeaside.person.owner.command.CommandWrapper;
import com.familyFarmSeaside.person.owner.command.concreteCommand.ResourceLogCommand;
import com.familyFarmSeaside.person.owner.command.concreteCommand.ResidenceLogCommand;
import com.familyFarmSeaside.person.owner.command.concreteCommand.UndoCommand;
import com.familyFarmSeaside.person.visitor.Customer;
import com.familyFarmSeaside.person.visitor.Traveller;
import com.familyFarmSeaside.person.worker.longTerm.ResidenceAdministrator;
import com.familyFarmSeaside.person.worker.longTerm.ResourceAdministrator;
import com.familyFarmSeaside.person.worker.longTerm.guard.Guard;
import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.person.worker.longTerm.repairman.Repairman;
import com.familyFarmSeaside.scene.Scene;

import java.util.List;
import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The owner of the farm.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class FarmOwner extends Person {
  private String logFile = "";
  private CommandHistory commandHistory = new CommandHistory();
  private Map<LongTermWorker.WokerType, Double> salaryTable;
//  private List<LongTermWorker> longTermWorkers = new ArrayList<>();
  private Map<LongTermWorker.WokerType, List<LongTermWorker>> longTermWorkers ;

  private void executeCommand(Command command){
    if(command.execute()) {
      commandHistory.addCommand(command);
    }
  }

  public void undoCommand(){
    Command command = commandHistory.popCommand();
    command.unDo();
  }

  public void hire(LongTermWorker.WokerType wokerType){
    //longTermWorkers.add(new )

  }

  public String getLogFile(){
    return logFile;
  }

  public void setLogFile(String logFile){
    this.logFile = logFile;
  }

  private LongTermWorker getLongTermWorkerOfAType(LongTermWorker.WokerType wokerType){
    return null;
  }

  public void giveSalary(){
//    for (LongTermWorker l :
//      longTermWorkers) {
//      double salary = salaryTable.get(l.getWokerType());
//      l.addMoney(salary);
//      minusMoney(salary);
//    }
  }

  public void changeSalary(LongTermWorker.WokerType wokerType, double newSalary){

  }

  public void buyResources(Map<?,Integer> thingsToBuy){
    // double budget =  buyer.getBudget(thingsToBuy)
    // buyer.add
    // minus
    // buyer.buy()
  }

  public void welcomeTraveller(List<Traveller> travellers){

  }

  public void welcomeCustomer(List<Customer> customers){

  }

  public void buildBuilding(Map<Scene,Integer> tobeBuilt){

  }

  public static void main(String[] args) {
    FarmOwner farmOwner = new FarmOwner();
    System.out.println("------------ Try command pattern ---------------");
    CommandWrapper residenceLogCommandWrapper = ()->{
      farmOwner.executeCommand(new ResidenceLogCommand(farmOwner));
    };
    CommandWrapper resourceCommandWrapper = ()->{
      farmOwner.executeCommand(new ResourceLogCommand(farmOwner));
    };
    CommandWrapper undoCommandWrapper = ()->{
      farmOwner.executeCommand(new UndoCommand(farmOwner));
    };
    ResidenceAdministrator residenceAdministrator = new ResidenceAdministrator(residenceLogCommandWrapper);
    ResourceAdministrator resourceAdministrator = new ResourceAdministrator(resourceCommandWrapper,undoCommandWrapper);
    try {
      System.out.println("Let repairman and guard do some log. The logfile is:");
      residenceAdministrator.doSomeLog();
      Thread.sleep(1000);
      resourceAdministrator.doSomeLog();
      Thread.sleep(1000);
      residenceAdministrator.doSomeLog();
      System.out.print(farmOwner.getLogFile());
      // Now is undo function
      resourceAdministrator.undoLog();
      System.out.println("Undo one command. The logfile is:");
      System.out.print(farmOwner.getLogFile());
      farmOwner.undoCommand();
      System.out.println("Undo one more command. The logfile is:");
      System.out.println(farmOwner.getLogFile());
    }catch (InterruptedException e){
      System.out.println(e.toString());
    }
    System.out.println("--------------------------------------------");

  }
}
