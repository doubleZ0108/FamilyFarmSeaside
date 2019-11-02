package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import main.java.com.familyFarmSeaside.person.worker.longTerm.LongTermWorker;

/**
 * @program: FamilyFarmSeaside
 * @description: The abstract base class of furniture
 * @author: saturn
 * @create: 2019/10/24
 **/
abstract public class Furniture {
    protected boolean sharable;  //标记是否可共享
    protected int referenceCount;  //记录被引用的次数

    public abstract void move();   //家具类移动的虚函数
    public boolean isSharable(){
        return sharable;
    }  //返回共享标志
    public int getReferenceCount(){return referenceCount;}  //返回引用计数
    public void minusReferenceCount(){ //共享的对象有副本产生时引用计数减1
        if(--referenceCount == 0){
            System.out.println("\nThis furniture object has been released!\n");
        }
    }
    public Furniture getReference(){  //返回家具引用
        referenceCount++;
        return this;
    }
}
