package com.familyFarmSeaside.person;

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
  protected double money;
  private UUID id;

  public void addMoney(double value){
    money += value;
  }

  public void minusMoney(double value){
  }

  public static void main(String[] args){
    System.out.println("hello");
  }
}
