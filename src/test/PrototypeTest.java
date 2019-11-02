package test;

import main.java.com.familyFarmSeaside.Animal.DetailSpecies.Chicken;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for Prototype Pattern
 * @author: Xuefei Lv
 * @create: 2019/10/27
 **/

public class PrototypeTest {
    static  public  void  testPrototype()throws CloneNotSupportedException{
        Chicken chicken = new Chicken();
        System.out.println("创建一个对象chicken...");
        Chicken chicken1 = (Chicken) chicken.clone();
        System.out.println("从chicken克隆一个对象chicken1...");
        System.out.println("chicken == chicken1 : " + (chicken == chicken1) );
        System.out.println("chicken.equals(chicken1): "+(chicken.equals(chicken1)));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Chicken : Chicken() : Inherited from Poultry and implements Cloneable, create an instance of chicken.");
        System.out.println("Chicken : equals() : Inherited from Poultry and implements Cloneable, judge whether two chickens are the same one.");
        System.out.println("Chicken : clone() : Inherited from Poultry and implements Cloneable, clone another chicken from the original one, namely the prototype");
        System.out.println("");

        PrototypeTest.testPrototype();
    }
}
