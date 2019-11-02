package main.java.com.familyFarmSeaside.person.owner;

import main.java.com.familyFarmSeaside.person.Person;
import main.java.com.familyFarmSeaside.person.owner.command.Command;
import main.java.com.familyFarmSeaside.person.owner.command.CommandHistory;
import main.java.com.familyFarmSeaside.person.visitor.Customer;
import main.java.com.familyFarmSeaside.person.visitor.Traveller;
import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import main.java.com.familyFarmSeaside.scene.Scene;

import java.util.List;
import java.util.Map;

/**
 * @program: FamilyFarmSeaside
 * @description: The owner of the farm.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class FarmOwner extends Person {
  private static FarmOwner farmOwner;

  private FarmOwner(){}

  public static FarmOwner getInstance(){
    if(farmOwner == null){
      System.out.println("这是第一次创建 FarmOwner，使用 new ");
      farmOwner = new FarmOwner();
    }else {
      System.out.println("已经创建过对象，直接返回");
    }

    return farmOwner;
  }

  private String logFile = "";
  private CommandHistory commandHistory = new CommandHistory();
  private Map<LongTermWorker.WokerType, Double> salaryTable;
//  private List<LongTermWorker> longTermWorkers = new ArrayList<>();
  private Map<LongTermWorker.WokerType, List<LongTermWorker>> longTermWorkers ;

  public void executeCommand(Command command){
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

  public static FarmOwner getFarmOwner() {
    return farmOwner;
  }

  public static void setFarmOwner(FarmOwner farmOwner) {
    FarmOwner.farmOwner = farmOwner;
  }

  public CommandHistory getCommandHistory() {
    return commandHistory;
  }

  public void setCommandHistory(CommandHistory commandHistory) {
    this.commandHistory = commandHistory;
  }

  public Map<LongTermWorker.WokerType, Double> getSalaryTable() {
    return salaryTable;
  }

  public void setSalaryTable(Map<LongTermWorker.WokerType, Double> salaryTable) {
    this.salaryTable = salaryTable;
  }

  public Map<LongTermWorker.WokerType, List<LongTermWorker>> getLongTermWorkers() {
    return longTermWorkers;
  }

  public void setLongTermWorkers(Map<LongTermWorker.WokerType, List<LongTermWorker>> longTermWorkers) {
    this.longTermWorkers = longTermWorkers;
  }
}
