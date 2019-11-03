package main.java.com.familyFarmSeaside.person.visitor;

import java.util.Map;
import java.util.UUID;

/**
 * @program: FamilyFarmSeaside
 * @description: The people who buy from the farm owner.
 * @author: CodeGroup
 * @create: 2019/10/19
 **/
public class Customer extends Visitor {
  Map<?,Integer> thingsToBuy;//Things to buy

  public Customer(Map<?, Integer> thingsToBuy) {
    this.thingsToBuy = thingsToBuy;
  }

  public Customer(String name, int age, double money, UUID id, Map<?, Integer> thingsToBuy) {
    super(name, age, money, id);
    this.thingsToBuy = thingsToBuy;
  }

  @Override
  public String toString() {
    return "class Customer extends Visitor";
  }
}
