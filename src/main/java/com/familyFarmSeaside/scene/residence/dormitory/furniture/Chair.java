package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The class for chair
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Chair extends Furniture {

    //构造函数
    public Chair(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Chair object created");
    }

    //重写家具移动函数
    @Override
    public void move() {
        sharable = false;
        System.out.println("Chair is moved!");
    }
}
