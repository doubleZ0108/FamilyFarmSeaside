package main.java.com.familyFarmSeaside.person.worker.shortTerm.builder;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.HouseBuilderImpl;
import main.java.com.familyFarmSeaside.person.worker.shortTerm.builder.impl.BreedSceneBuilderImpl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: The director class for building a prototype.
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
public class Director {
  private Builder builder;

  public Director(Builder builder){
    this.builder = builder;
  }

  public void buildANormalScene(){
     /**
       * @description: This is the duty of director. It specifies a common type of construction which is often constructed.
       *

       *
       * @return : void
       **/
    System.out.println("Director: This will generate an ordinary scene");
    // determain which type of builder it is
    if(builder instanceof BreedSceneBuilderImpl){
      builder.setBuildingPlan("Farmland");
    }else if (builder instanceof HouseBuilderImpl){
      builder.setBuildingPlan("Dormitory");
    }else {
      builder.setBuildingPlan("Warehouse");
    }
    // do some normal construction
    builder.setLocation("Center of the farm");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date dt = new Date();
    Calendar rightNow = Calendar.getInstance();
    rightNow.setTime(dt);
    rightNow.add(Calendar.MONTH, 1);
    Date oneMonthLater = rightNow.getTime();
    builder.setDueDate(oneMonthLater);
  }

  public Builder getBuilder() {
    return builder;
  }

  public void setBuilder(Builder builder) {
    this.builder = builder;
  }

  @Override
  public String toString() {
    return "class Director";
  }
}
