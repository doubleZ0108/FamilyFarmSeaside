package main.java.com.familyFarmSeaside.person.worker.longTerm;


import main.java.com.familyFarmSeaside.person.owner.command.CommandWrapper;
import main.java.com.familyFarmSeaside.scene.residence.facade.ResidenceTask;

/**
 * @program: FamilyFarmSeaside
 * @description: The administrator of dorm
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class ResidenceAdministrator extends LongTermWorker {
//  Dormitory dormitory;
//  List<LongTermWorker> longTermWorkersInDorm;
// the above two attributes have been removed. A new package is added in the residence package called facade, which has a class ResidenceTask, representing the area responsible for each administrator.
  private ResidenceTask residenceTask;
  public ResidenceAdministrator(){};
  private CommandWrapper logCommand;
  public ResidenceAdministrator(CommandWrapper residenceLogCommand){
    this.logCommand = residenceLogCommand;
  }
  public void doSomeLog(){
    if(logCommand != null) {
      logCommand.execute();
    }
  }
  public void setResidenceTask(ResidenceTask rt){
    residenceTask = rt;
  }

  public void wakeUp(){
    residenceTask.wakeUp();
  }
  public void lightOff(){
    residenceTask.lightOff();
  }
  public void sweep(){
    residenceTask.sweep();
  }
  public void takeTrash(){
    residenceTask.takeTrash();
  }
//  public void cleanUp(){
//
//  }

}
