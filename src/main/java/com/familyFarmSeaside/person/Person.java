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

  public static void main(String[] args){
    System.out.println("hello");
  }
}
