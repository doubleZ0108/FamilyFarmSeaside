package main.java.com.familyFarmSeaside.Plant.State;

import main.java.com.familyFarmSeaside.Plant.Plant;

/**
 * @program: FamilyFarmSeaside
 * @description: dead state of plant
 * @author: Di
 * @create: 2019/10/28
 **/
public class DeadState implements PlantState {

    /**
     * the name of the state
     * final
     */
    private final String name = "Dead";

    /**
     * get the name of the state
     * @return the name of the state
     */
    @Override
    public String getStateName() {
        return name;
    }

    /**
     * change the state of the plant
     * don't do anything, the plant is already dead
     * @param p the specific plant
     */
    @Override
    public void moveToNext(Plant p) {
        System.out.println("this is a dead " + p.getPlantType() + ". leave it alone");
    }
}