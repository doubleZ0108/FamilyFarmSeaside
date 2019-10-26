package com.familyFarmSeaside.scene.residence.dormitory;

import com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import com.familyFarmSeaside.scene.residence.Residence;

import java.util.*;

/**
 * @program: FamilyFarmSeaside
 * @description: The house for workers.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Dormitory extends Residence {
  private static final int ROON_NUM = 50;

  public Dormitory(){
    super(20000);
    rooms = new ArrayList<>();
    longTermWorkers = new ArrayList<>();
    createRooms();
    System.out.println("一栋员工宿舍被创建");
  }

  public int getDormNumber(){
    return dormNumber;
  }
  public void setDormNumber(int id){
    dormNumber = id;
  }

  public List<LongTermWorker> getLongTermWorkers(){
    return longTermWorkers;
  }

  @Override
  public String getDescription() {
    return "这是一栋宿舍";
  }


  private void createRooms(){
    RoomFactory roomFactory = new RoomFactory();
    for(int i = 0; i < ROON_NUM; i++){
      rooms.add(roomFactory.createRoom(i));
    }
  }

  public void addLongTermWorker(LongTermWorker longTermWorker){
    longTermWorkers.add(longTermWorker);
  }

  private int dormNumber;
  private List<Room> rooms;
  private List<LongTermWorker> longTermWorkers;
}
