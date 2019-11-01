package main.java.com.familyFarmSeaside.person.worker;

import main.java.com.familyFarmSeaside.person.Person;

import java.util.UUID;

/**
 * @program: FamilyFarmSeaside
 * @description: The base of all worker
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class Worker extends Person {
    public Worker() {
    }

    public Worker(String name, int age, double money, UUID id) {
        super(name, age, money, id);
    }

    @Override
    public String toString() {
        return "abstract class Worker extends Person";
    }
}
