package main.java.com.familyFarmSeaside.Plant.State;

import main.java.com.familyFarmSeaside.Plant.Plant;

/**
 * @program: FamilyFarmSeaside
 * @description: harvestable state of plant
 * @author: Di
 * @create: 2019/10/28
 **/
public class HarvestableState implements PlantState {

    /**
     * the name of the state
     * final
     */
    private final String name = "Harvestable";

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
     * @param p the specific plant
     */
    @Override
    public void moveToNext(Plant p) {
        System.out.println("the harvestable " + p.getPlantType() + " has been harvested, not it's dead");
        p.setPlantState(new DeadState());
    }
}