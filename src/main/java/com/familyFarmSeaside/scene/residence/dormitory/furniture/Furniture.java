package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The abstract base class of furniture
 * @author: saturn
 * @create: 2019/10/24
 **/
abstract public class Furniture {
    protected boolean sharable;          //Whether the mark can be shared
    protected int referenceCount;       //Record the number of times referenced

    public abstract void move();   //Virtual function of furniture class moving

    public boolean isSharable(){
        return sharable;
    }  //Return share flag

    public int getReferenceCount(){return referenceCount;}  //Return reference counting

    public void minusReferenceCount(){ //The shared object has a reference count minus 1 when the copy is generated.
        if(--referenceCount == 0){
            System.out.println("\nThis furniture object has been released!\n");
        }
    }

    public Furniture getReference(){  //Return to furniture reference
        referenceCount++;
        return this;
    }
}
