package main.java.com.familyFarmSeaside.person.worker.shortTerm.builder;

import java.util.Date;

public interface Builder {
  void reset();
  void setLocation(String location);
  void setBuildingPlan(String plan);
  void setDueDate(Date dueDate);
}
