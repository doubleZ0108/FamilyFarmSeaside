package com.familyFarmSeaside.Plant.State;

import com.familyFarmSeaside.Plant.Plant;

/**
 * @program: FamilyFarmSeaside
 * @description: interface of plant state
 * @author: Di
 * @create: 2019/10/28
 **/
public interface PlantState {
    String getStateName();
    void moveToNext(Plant p);
}
