package test;

import main.java.com.familyFarmSeaside.Product.Factory.ProductFactory;
import main.java.com.familyFarmSeaside.Product.Factory.SpringProductFactory;
import main.java.com.familyFarmSeaside.Product.Factory.SummerProductFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test for Abstract Factory pattern.
 * @author: Zhe Zhang
 * @create: 2019/10/28
 **/
public class AbstractFactoryTest {

    private enum FactoryKind {dummy, Spring, Summer};

    static FactoryKind factoryKind = FactoryKind.dummy;
    static ProductFactory productfactory = null;

    public static void TestSpecies(){
        /**
         * @description: Print the species of fruit & vegetable this product factory product.
         *
         * @return : void
         **/
        System.out.println("@@ 工厂当前生产的产品是: ");
        System.out.println(productfactory.getFruit_species());
        System.out.println(productfactory.getVegetable_species());
    }

    public static void TestProduct(){
        /**
         * @description: Product a fruit and a vegetable.
         *
         * @return : void
         **/
        productfactory.productFruit();
        productfactory.productVegetable();
    }

    public static void TestOutputWarehouse(){
        productfactory.getWarehouse();
    }

    public static void SwitchProductFactory(FactoryKind opcode){
        /**
         * @description: Dynamic change the kind of factory.
         *
         * @param opcode : The fresh kind of product factory user input.
         *
         * @return : void
         **/
        boolean empty_flag = factoryKind.equals(FactoryKind.dummy); //是否是第一次建立工厂
        boolean equal_flag = factoryKind.equals(opcode);    //用户想要修改的工厂是否和之前的工厂相同

        /*
            如果工厂之前是空的，则初始化一个新工厂
            如果工厂之前生产的是其他东西，把之前的产品保存
            如果工厂之前生产的就是当前的东西，则直接return
         */
        if(empty_flag || !equal_flag){
            switch (opcode){
                case Spring:
                    productfactory = (empty_flag || equal_flag)? (new SpringProductFactory()) :
                            (new SpringProductFactory(productfactory.getFruits_warehouse(), productfactory.getVegetables_warehouse()));
                    factoryKind = FactoryKind.Spring;
                    break;
                case Summer:
                    productfactory = (empty_flag || equal_flag)? (new SummerProductFactory()):
                            (new SummerProductFactory(productfactory.getFruits_warehouse(), productfactory.getVegetables_warehouse()));
                    factoryKind = FactoryKind.Summer;
                    break;
                default:
                    break;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("—————————————————测试抽象工厂模式———————————————————");

        System.out.println("SpringProductFactory : (objectid) : createFruit : Inherited from ProductFactory, create apple and add them into product warehouse.");
        System.out.println("SpringProductFactory : (objectid) : createVegetable : Inherited from ProductFactory, create potato and add them into product warehouse.");
        System.out.println("SummerProductFactory : (objectid) : createFruit : Inherited from ProductFactory, create cherry and add them into product warehouse.");
        System.out.println("SummerProductFactory : (objectid) : createVegetable : Inherited from ProductFactory, create tomato and add them into product warehouse.");

        Scanner input = new Scanner(System.in);
        FactoryKind opcode;

        boolean stop_flag = false;

        do{
            System.out.print("请选择农产品工厂[1 春季农产品 | 2 夏季农产品 | 0]");

            /* 用户指定使用何种工厂生产 */
            try{
                int i = Integer.parseInt(input.nextLine());
                opcode = FactoryKind.values()[i];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("错误输入，请重新选择");
                System.out.println("");
                continue;
            }catch (InputMismatchException e2){
                System.out.println("错误输入，请重新选择");
                System.out.println("");
                continue;
            }catch (NumberFormatException e3)
            {
                System.out.println("错误输入，请重新选择");
                System.out.println("");
                continue;
            }

            if(opcode == FactoryKind.dummy){
                stop_flag = !stop_flag;
            }
            else{
                SwitchProductFactory(opcode);

                TestSpecies();
                TestProduct();
                TestOutputWarehouse();
            }

        }while(!stop_flag);

        System.out.println("--------------------------------------------------");
    }

}
