package com.familyFarmSeaside.Animal.Action;

import com.familyFarmSeaside.Animal.Animal;

/**
 * @program: FamilyFarmSeaside
 * @description: realization of animal swim action
 * @author: Di
 * @create: 2019/10/26
 **/
public class SwimAction implements ExerciseAction {

    public Animal target;
    public void getself(Animal getanimal) {
        target = getanimal;
    }

    @Override
    public void runaction() {
        // TODO Auto-generated method stub
        String animalname = this.target.getDetailedSpecies();
        System.out.println(animalname+" is swimming!");
    }

}