package main.java.com.familyFarmSeaside.scene.residence.dormitory;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;
import main.java.com.familyFarmSeaside.scene.residence.Residence;

import java.util.*;

/**
 * @program: FamilyFarmSeaside
 * @description: The house for workers.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Dormitory extends Residence {
  public static final int ROON_NUM = 10;
  private int dormNumber;
  private List<Room> rooms;
  private List<LongTermWorker> longTermWorkers;

  public Dormitory(){
    super(20000);
    rooms = new ArrayList<>();
    longTermWorkers = new ArrayList<>();
    createRooms();
    System.out.println("一栋员工宿舍被创建");
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

  public Room getRoomById(int id){
    if(id >= 0 && id < ROON_NUM){
      return rooms.get(id);
    }
    else {
      return null;
    }
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

}
