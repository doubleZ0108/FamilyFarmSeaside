package com.familyFarmSeaside.Animal.Action;

import com.familyFarmSeaside.Animal.Animal;
import com.familyFarmSeaside.Animal.AnimalAction;

/**
 * @program: FamilyFarmSeaside
 * @description: interface of animal exercise action
 * @author: Di
 * @create: 2019/10/26
 **/
public interface ExerciseAction extends AnimalAction {
    public void getself(Animal getanimal);
    public void runaction();
}
