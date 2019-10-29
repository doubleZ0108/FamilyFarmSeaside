package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The class for chair
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Chair extends Furniture {

    public Chair(){
        isSharable = true;
        System.out.println("New Chair object created");
    }

    @Override
    public void move() {
        isSharable = false;
        System.out.println("Chair is moved!");
    }
}
