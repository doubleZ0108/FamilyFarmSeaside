package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The class for bed
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Bed extends Furniture {

    public Bed(){
        isSharable = true;
        System.out.println("New Bed object created");
    }

    @Override
    public void move() {
        isSharable = false;
        System.out.println("Bed is moved!");
    }
}
