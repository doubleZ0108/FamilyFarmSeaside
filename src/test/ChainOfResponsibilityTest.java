package test;

import main.java.com.familyFarmSeaside.Animal.Action.Shower.*;

/**
 * @program: FamilyFarmSeaside
 * @description: The test for Chain Of Responsibility pattern.
 * @author: stern
 * @create: 2019/10/27
 **/
public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— 测试[Chain of Responsibility]模式 —————————————-------------------------------------————");


        System.out.println("Shower : addAnimalName() : Add a name to the list of animals' names.");
        System.out.println("Shower : setSuccessor() : Set the successor's responsibility object.");
        System.out.println("Shower : showAnimalName() : Show animal name.");
        System.out.println("Shower : selectPattern() : Call animal shower method, scan chain give feedback.");
        System.out.println("");
        Shower shower1 = new ShowerPattern("1");
        shower1.addAnimalName("Pig");
        shower1.addAnimalName("Cow");
        shower1.addAnimalName("Goat");
        Shower shower2 = new ShowerPattern("2");
        shower2.addAnimalName("Cat");
        shower2.addAnimalName("Dog");
        shower1.setSuccessor(shower2);

        shower1.showAnimalName();
        shower2.showAnimalName();

        shower1.selectPattern("Cat");
        shower1.selectPattern("Goat");
        shower1.selectPattern("Zebra");

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
