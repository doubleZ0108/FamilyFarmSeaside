package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Product.ProductFactory.ProductFactory;
import main.java.com.familyFarmSeaside.Product.ProductFactory.SpringProductFactory;
import main.java.com.familyFarmSeaside.Product.ProductFactory.SummerProductFactory;

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
        boolean empty_flag = factoryKind.equals(FactoryKind.dummy);     //Is it the first time to set up a factory?
        boolean equal_flag = factoryKind.equals(opcode);                //Is the factory that the user wants to modify the same as the previous factory?

        /*
            Initialize a new factory if the factory was previously empty
            If the factory produced something else before, save the previous product.
            If the factory produced the current thing, then directly return
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
        System.out.println("—————————————-------------------------------------———— Test[Abstract Factory]Pattern —————————————-------------------------------------————");

        System.out.println("ProductFactory : getFruit_species() : Abstract function of get fruit species. Concrete realization in SpringProductFactory and SummerProductFactory.");
        System.out.println("ProductFactory : getVegetable_species() : Abstract function of get vegetable species. Concrete realization in SpringProductFactory and SummerProductFactory.");
        System.out.println("SpringProductFactory: SpringProductFactory() : Use previous products in warehouse to rebuild SpringProductFactory.");
        System.out.println("SummerProductFactory: SummerProductFactory() : Use previous products in warehouse to rebuild SummerProductFactory.");
        System.out.println("SpringProductFactory : productFruit() : Inherited from ProductFactory, create apple and add them into product warehouse.");
        System.out.println("SpringProductFactory : productVegetable() : Inherited from ProductFactory, create potato and add them into product warehouse.");
        System.out.println("SummerProductFactory : productFruit() : Inherited from ProductFactory, create cherry and add them into product warehouse.");
        System.out.println("SummerProductFactory : productVegetable() : Inherited from ProductFactory, create tomato and add them into product warehouse.");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        FactoryKind opcode;

        boolean stop_flag = false;

        do{
            System.out.print("请选择农产品工厂[1 春季农产品 | 2 夏季农产品 | 0]: ");

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

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }

}
