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
    }
}
