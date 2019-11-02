package main.java.com.familyFarmSeaside.Supply.Visitor;

import main.java.com.familyFarmSeaside.Supply.Consumable.Consumable;
import main.java.com.familyFarmSeaside.Supply.Element;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class spv_admin implements SupplyVisitor {
    @Override
    public void visitTool(Tool tool) {
        System.out.println("Administrator inspect Tools and focus on their durability");
        System.out.println("The state of this tool is "+tool.getContext().getState().getStateName());
    }

    @Override
    public void visitConsumable(Consumable consumable) {
        System.out.println("Administrator inspect Consumable and focus on its amount and lasting time");
        System.out.println("The amount of this consumable is "+consumable.getStorage()+" and it will expire at "+consumable.getExpirationDate());
    }
}