package main.java.com.familyFarmSeaside.Supply;

import main.java.com.familyFarmSeaside.Supply.Visitor.SupplyVisitor;

/**
* @program: Element.java
*
* @description:
*
* @author: Yimo Liu
*
* @create: 2019/10/30
**/
public interface Element {
    void accept(SupplyVisitor visitor);
}
