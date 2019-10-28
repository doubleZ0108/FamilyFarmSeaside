package com.familyFarmSeaside.Plant.State;

import com.familyFarmSeaside.Plant.Plant;

/**
 * @program: FamilyFarmSeaside
 * @description: mature state of plant
 * @author: Di
 * @create: 2019/10/28
 **/
public class MatureState implements PlantState {

    /**
     * the name of the state
     * final
     */
    private final String name = "Mature";

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
        System.out.println("the mature" + p.getPlantType() + "is now harvestable.");
        p.setPlantState(new HarvestableState);
    }
}