package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The class for desk
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Desk extends Furniture {

    public Desk(){
        isSharable = true;
        System.out.println("New Desk object created");
    }

    @Override
    public void move() {
        isSharable = false;
        System.out.println("Desk is moved!");
    }

}
