package main.java.com.familyFarmSeaside.Supply.Visitor;

import main.java.com.familyFarmSeaside.Supply.Consumable.Consumable;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class spv_peasant implements SupplyVisitor {
    @Override
    public void visitConsumable(Consumable consumable) {
        System.out.println("Peasants need consume consumable while working.");
        consumable.consume(1);
    }

    @Override
    public void visitTool(Tool tool) {
        System.out.println("Peasants need use tools to work.");
        tool.take();
    }
}