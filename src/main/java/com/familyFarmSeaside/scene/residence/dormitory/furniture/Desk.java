package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The class for desk
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Desk extends Furniture {

    //构造函数
    public Desk(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Desk object created");
    }

    //重写家具类移动函数
    @Override
    public void move() {
        sharable = false;
        System.out.println("Desk is moved!");
    }

}
