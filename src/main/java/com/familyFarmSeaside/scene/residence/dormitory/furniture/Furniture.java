package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The abstract base class of furniture
 * @author: saturn
 * @create: 2019/10/24
 **/
abstract public class Furniture {
    protected boolean isSharable;

    public abstract void move();
    public boolean isSharable(){
        return isSharable;
    }

    public void setSharable(boolean sharable) {
        isSharable = sharable;
    }

    public Furniture(){

    }

    public Furniture(boolean isSharable) {
        this.isSharable = isSharable;
    }
}
