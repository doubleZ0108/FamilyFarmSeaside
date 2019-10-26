package main.java.com.familyFarmSeaside.Plant;

import main.java.com.familyFarmSeaside.Product.Product;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: doubleZ
 * @create: 2019/10/24
 **/
public abstract class Plant extends Product {

    static protected enum LifeStage {GROWTH, BREEDING, MATURE};  //生长期 繁殖期 成熟期
    protected LifeStage lifestage;      //生命阶段

    protected int nutritionValue;   //营养值

}
