package main.java.com.familyFarmSeaside.person.worker.shortTerm.builder;

import java.util.Date;
 /**
  * @program: Builder.java
  *
  * @description: The interface for builders to implememt
  *
  * @author: Zijian Zhang
  *
  * @create: 2019/11/2
  **/
public interface Builder {
  void reset();
  void setLocation(String location);
  void setBuildingPlan(String plan);
  void setDueDate(Date dueDate);
}
