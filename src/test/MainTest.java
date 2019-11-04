package test;
import test.DesignPatternTest.*;

import java.util.Scanner;


/**
 * @program: FamilyFarmSeaside
 * @description: main test
 * @author: Xuefei Lv
 * @create: 2019/11/02
 **/

public class MainTest {

    public static void display_interface(){
        System.out.println("---------------Design Pattern List---------------");
        System.out.println("**             1 --- Abstract Factory          **");
        System.out.println("**             2 --- Adapter                   **");
        System.out.println("**             3 --- Bridge                    **");
        System.out.println("**             4 --- Builder                   **");
        System.out.println("**             5 --- Chain of Responsibility   **");
        System.out.println("**             6 --- Command                   **");
        System.out.println("**             7 --- Composite                 **");
        System.out.println("**             8 --- Decorator                 **");
        System.out.println("**             9 --- Facade                    **");
        System.out.println("**            10 --- Factory Method            **");
        System.out.println("**            11 --- Flyweight                 **");
        System.out.println("**            12 --- Interpreter               **");
        System.out.println("**            13 --- Iterator                  **");
        System.out.println("**            14 --- Mediator                  **");
        System.out.println("**            15 --- Memento                   **");
        System.out.println("**            16 --- Observer                  **");
        System.out.println("**            17 --- Prototype                 **");
        System.out.println("**            18 --- Proxy                     **");
        System.out.println("**            19 --- Singleton                 **");
        System.out.println("**            20 --- State                     **");
        System.out.println("**            21 --- Strategy                  **");
        System.out.println("**            22 --- Template Method           **");
        System.out.println("**            23 --- Visitor                   **");
        System.out.println("**            24 --- Reference Counting        **");
        System.out.println("**            25 --- Copy on Write             **");
        System.out.println("**            26 --- Shareable                 **");
        System.out.println("**            27 --- AOP                       **");
        System.out.println("**            28 --- IOC                       **");
        System.out.println("-------------------------------------------------");
        System.out.print("Which design pattern do you want to test? [0 to quit]: ");
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        boolean flag = true;
        int opCode;
        Scanner input = new Scanner(System.in);

        do{
            display_interface();
            opCode = input.nextInt();

            if(opCode == 0){
                flag = false;
            }
            else{
                switch (opCode){
                    case 1:
                        AbstractFactoryTest.main(new String[]{});
                        break;
                    case 2:
                        AdapterTest.main(new String[]{});
                        break;
                    case 3:
                        BridgeTest.main(new String[]{});
                        break;
                    case 4:
                        BuilderTest.main(new String[]{});
                        break;
                    case 5:
                        ChainOfResponsibilityTest.main(new String[]{});
                        break;
                    case 6:
                        CommandTest.main(new String[]{});
                        break;
                    case 7:
                        CompositeTest.main(new String[]{});
                        break;
                    case 8:
                        DecoratorTest.main(new String[]{});
                        break;
                    case 9:
                        FacadeTest.main(new String[]{});
                        break;
                    case 10:
                        FactoryMethodTest.main(new String[]{});
                        break;
                    case 11:
                        FlyweightTest.main(new String[]{});
                        break;
                    case 12:
                        InterpreterTest.main(new String[]{});
                        break;
                    case 13:
                        IteratorTest.main(new String[]{});
                        break;
                    case 14:
                        MediatorTest.main(new String[]{});
                        break;
                    case 15:
                        MementoTest.main(new String[]{});
                        break;
                    case 16:
                        ObserverTest.main(new String[]{});
                        break;
                    case 17:
                        PrototypeTest.main(new String[]{});
                        break;
                    case 18:
                        ProxyTest.main(new String[]{});
                        break;
                    case 19:
                        SingletonTest.main(new String[]{});
                        break;
                    case 20:
                        StateTest.main(new String[]{});
                        break;
                    case 21:
                        StrategyTest.main(new String[]{});
                        break;
                    case 22:
                        TemplateMethodTest.main(new String[]{});
                        break;
                    case 23:
                        VisitorTest.main(new String[]{});
                        break;
                    case 24:
                        ReferenceCountingTest.main(new String[]{});
                        break;
                    case 25:
                        CopyOnWriteTest.main(new String[]{});
                        break;
                    case 26:
                        SharableTest.main(new String[]{});
                        break;
                    case 27:
                        AOPTest.main(new String[]{});
                        break;
                    case 28:
                        IOCTest.main(new String[]{});
                        break;
                    default:
                        System.out.println("Invalid input!");
                        System.out.println("Please input again!");
                }
            }

        }while(flag);

        System.out.println("");
        System.out.println("========= End of Design Patterns Test ==========");

    }
}
