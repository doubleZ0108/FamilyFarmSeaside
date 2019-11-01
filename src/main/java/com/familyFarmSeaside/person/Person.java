package main.java.com.familyFarmSeaside.person;

import java.util.UUID;

/**
 * @program: FamilyFarmSeaside
 * @description: The base class of all people.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public abstract class Person {
  protected String name;
  protected enum sex {MALE, FEMAIL};
  protected int age;
  protected double money = 1000;
  private UUID id;

  public void addMoney(double value){
    money += value;
  }

  public void minusMoney(double value){ money -= value;}

  public double getMoney(){return money;}

  public Person(){
  }

  public Person(String name, int age, double money, UUID id) {
    this.name = name;
    this.age = age;
    this.money = money;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "abstract class Person";
  }
}
