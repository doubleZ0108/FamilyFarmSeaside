package test;

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
    FarmOwner farmOwner = FarmOwner.getInstance();
    System.out.println("---------------测试命令模式-----------------");
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
      }
      System.out.print(farmOwner.getLogFile());
      command = scanner.nextLine();
    }
    System.out.println("---------------------------------------------");

  }
}
