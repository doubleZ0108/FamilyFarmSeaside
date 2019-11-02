package main.java.com.familyFarmSeaside.person.visitor;

import java.util.UUID;

/**
 * @program: FamilyFarmSeaside
 * @description: The people who travel to the farm.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Traveller extends Visitor {
    public Traveller() {
    }

    public Traveller(String name, int age, double money, UUID id) {
        super(name, age, money, id);
    }

    @Override
    public String toString() {
        return "class Traveller extends Visitor";
    }
}
