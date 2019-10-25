package com.familyFarmSeaside.person.worker.longTerm;


import com.familyFarmSeaside.person.owner.command.CommandWrapper;
import com.familyFarmSeaside.scene.residence.facade.ResidenceTask;

/**
 * @program: FamilyFarmSeaside
 * @description: The administrator of dorm
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class ResidenceAdministrator extends LongTermWorker {
//  Dormitory dormitory;
//  List<LongTermWorker> longTermWorkersInDorm;
//  以上两个属性被去掉了。我在residence包里新增了一个包叫facade，里面有个类叫ResidenceTask，表示每个管理员负责的区域。
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
