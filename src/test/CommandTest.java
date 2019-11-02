package test;

import main.java.com.familyFarmSeaside.person.owner.FarmOwner;
import main.java.com.familyFarmSeaside.person.owner.command.CommandWrapper;
import main.java.com.familyFarmSeaside.person.owner.command.concreteCommand.ResidenceLogCommand;
import main.java.com.familyFarmSeaside.person.owner.command.concreteCommand.ResourceLogCommand;
import main.java.com.familyFarmSeaside.person.owner.command.concreteCommand.UndoCommand;
import main.java.com.familyFarmSeaside.person.worker.longTerm.ResidenceAdministrator;
import main.java.com.familyFarmSeaside.person.worker.longTerm.ResourceAdministrator;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for command pattern
 * @author: Zijian Zhang
 * @create: 2019/10/25
 **/
public class CommandTest {
  public static void main(String[] args) {

    FarmOwner farmOwner = FarmOwner.getInstance();
    System.out.println("---------------测试命令模式-----------------");
    System.out.println("FarmOwner : getInstance() : Farmowner is singelton, so we need a getInstance method to get it.");
    System.out.println("FarmOwner : executeCommand() : Execute the command, then add it to the command history.");
    System.out.println("ResidenceAdministrator : doSomeLog() : Do the command, if have a command, execute.");
    System.out.println("FarmOwner : getLogFile() : Get the log files.");
    System.out.println("");
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
    System.out.println("---------------------------------------------");

  }
}
