package main.java.com.familyFarmSeaside.person.visitor;

import main.java.com.familyFarmSeaside.person.Person;

import java.util.UUID;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class of visitors.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class Visitor extends Person {
    public Visitor() {
    }

    public Visitor(String name, int age, double money, UUID id) {
        super(name, age, money, id);
    }

    @Override
    public String toString() {
        return "abstract class Visitor extends Person";
    }
}
