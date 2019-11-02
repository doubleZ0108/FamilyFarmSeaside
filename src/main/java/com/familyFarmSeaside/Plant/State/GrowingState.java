package main.java.com.familyFarmSeaside.Plant.State;

import main.java.com.familyFarmSeaside.Plant.Plant;

/**
 * @program: FamilyFarmSeaside
 * @description: growing state of plant
 * @author: Di
 * @create: 2019/10/28
 **/
public class GrowingState implements PlantState{

    /**
     * the name of the state
     * final
     */
    private final String name = "Growing";

    /**
     * get the name of the state
     * @return the name of the state
     */
    @Override
    public String getStateName() {
        return name;
    }

    /**
     * change the stage of the plant
     * @param p the specific plant
     */
    @Override
    public void moveToNext(Plant p) {
        System.out.println("the growing " + p.getPlantType() + " is now mature.");
        p.setPlantState(new MatureState());
    }
}