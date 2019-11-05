package test.DesignPatternTest;

import java.util.Scanner;

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
 /**
   * @description: To test the command pattern, we have to have a main method
   *
   * @param args :
   *
   * @return : void
   **/
    // farm owner is using singleton pattern
    System.out.println("—————————————-------------------------------------———— Test[Command]Pattern —————————————-------------------------------------————");
    System.out.println("FarmOwner : getInstance() : Farmowner is singelton, so we need a getInstance method to get it.");
    System.out.println("FarmOwner : executeCommand() : Execute the command, then add it to the command history.");
    System.out.println("ResidenceAdministrator : doSomeLog() : Do the command, if have a command, execute.");
    System.out.println("FarmOwner : getLogFile() : Get the log files.");
    System.out.println("");
    FarmOwner farmOwner = FarmOwner.getInstance();
    CommandWrapper residenceLogCommandWrapper = ()->{
    // this is not important in terms of design pattern
    // but is crucial because of the design of java language
    // the object of command passed into the administrators are essentially some lambda expression
    // so we make some functional interface
      farmOwner.executeCommand(new ResidenceLogCommand(farmOwner));
    };
    CommandWrapper resourceCommandWrapper = ()->{
      farmOwner.executeCommand(new ResourceLogCommand(farmOwner));
    };
    CommandWrapper undoCommandWrapper = ()->{
      farmOwner.executeCommand(new UndoCommand(farmOwner));
    };
    // pass the functional interface into the administrators
    ResidenceAdministrator residenceAdministrator = new ResidenceAdministrator(residenceLogCommandWrapper);
    ResourceAdministrator resourceAdministrator = new ResourceAdministrator(resourceCommandWrapper,undoCommandWrapper);
    try {
      // we are trying to show some log
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
    // in order to boost the user's exprience
    // we add some interactive functions
    System.out.println("请您选择要执行的指令：(residence, resource, undo, quit)");
    Scanner scanner = new Scanner(System.in);
    String command = scanner.nextLine();
    while(!command.equals("quit")){
      switch(command){
        case "residence":{
          residenceAdministrator.doSomeLog();
        }break;
        case "resource":{
          resourceAdministrator.doSomeLog();
        }break;
        case "undo":{
          farmOwner.undoCommand();
        }break;
        default:{
          System.out.println("不支持您输入的指令");
        }
      }
      System.out.print(farmOwner.getLogFile());
      System.out.println("请您选择要执行的指令：(residence, resource, undo, quit)");
      command = scanner.nextLine();
    }

    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
  }
}
