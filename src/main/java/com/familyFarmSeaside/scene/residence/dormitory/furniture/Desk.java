package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

/**
 * @program: FamilyFarmSeaside
 * @description: The class for desk
 * @author: saturn
 * @create: 2019/10/24
 **/
public class Desk extends Furniture {

    public Desk(){
        sharable = true;
        referenceCount = 0;
        System.out.println("New Desk object created");
    }

    @Override
    public void move() {
        sharable = false;
        System.out.println("Desk is moved!");
    }

}
