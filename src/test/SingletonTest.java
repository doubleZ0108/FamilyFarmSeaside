package test;

import main.java.com.familyFarmSeaside.person.owner.FarmOwner;

/**
 * @program: FamilyFarmSeaside
 * @description: To test the function of singleton class.
 * @author: saturn
 * @create: 2019/11/01
 **/
public class SingletonTest {
    public static void main(String[] args){
        System.out.println("FarmOwner : getInstance() : Inherited from Person, create an instance of farm owner if there is none.");
        System.out.println("FarmOwner : getFarmOwner() : Inherited from Person, return the one and only farm owner.");
        System.out.println("");

        System.out.println("----------------测试单例模式-----------------");
        FarmOwner farmOwner_1 = FarmOwner.getInstance();
        FarmOwner farmOwner_2 = FarmOwner.getFarmOwner();
        System.out.println("---------------------------------------------");
    }
}
