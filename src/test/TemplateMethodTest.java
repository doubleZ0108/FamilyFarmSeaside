package test;

import main.java.com.familyFarmSeaside.Product.ProductFactory.SpringProductFactory;
import main.java.com.familyFarmSeaside.Product.ProductFactory.SummerProductFactory;

/**
 * @program: FamilyFarmSeaside
 * @description: Test for template method.
 * @author: Zhe Zhang
 * @create: 2019/11/02
 **/
public class TemplateMethodTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— 测试[Abstract Factory]模式 —————————————-------------------------------------————");

        System.out.println("SpringProductFactory : productFruit() : Implement template function productFruit from ProductFactory, create apple and add them into product warehouse.");
        System.out.println("SpringProductFactory : productVegetable() : Implement template function productVegetable from ProductFactory, create potato and add them into product warehouse.");
        System.out.println("SummerProductFactory : productFruit() : Implement template function productFruit from ProductFactory, create cherry and add them into product warehouse.");
        System.out.println("SummerProductFactory : productVegetable() : Implement template function productVegetable from ProductFactory, create tomato and add them into product warehouse.");
        System.out.println("");

        System.out.println("@@ SpringProductFactory使用基类ProductFactory的Template Method: ");
        SpringProductFactory springProductFactory = new SpringProductFactory();
        springProductFactory.productVegetable();
        springProductFactory.productFruit();
        System.out.println("");

        System.out.println("@@ SummerProductFactory使用基类ProductFactory的Template Method: ");
        SummerProductFactory summerProductFactory = new SummerProductFactory();
        summerProductFactory.productVegetable();
        summerProductFactory.productFruit();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
