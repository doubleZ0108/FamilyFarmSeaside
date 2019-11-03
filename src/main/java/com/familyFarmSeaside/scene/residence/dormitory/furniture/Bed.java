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
        sharable = true;
        referenceCount = 0;
        System.out.println("New Bed object created");
    }

    @Override
    public void move() {
        sharable = false;
        System.out.println("Bed is moved!");
    }
}
