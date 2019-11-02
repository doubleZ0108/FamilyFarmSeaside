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
        System.out.println("—————————————-------------------------------------———— 测试[Singleton]模式 —————————————-------------------------------------————");

        FarmOwner farmOwner_1 = FarmOwner.getInstance();
        FarmOwner farmOwner_2 = FarmOwner.getFarmOwner();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
