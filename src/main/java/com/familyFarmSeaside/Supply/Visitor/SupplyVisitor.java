package main.java.com.familyFarmSeaside.Supply.Visitor;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;
import main.java.com.familyFarmSeaside.Supply.Consumable.Consumable;

/**
* @program: SupplyVisitor.java
*
* @description: 
*
* @author: Yimo Liu
*
* @create: 2019/10/30
**/
public interface SupplyVisitor {
    void visitTool(Tool tool);
    void visitConsumable(Consumable consumable);
}
