package test;

import test.DesignPatternTest.MementoTest;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: main test
 * @author: Xuefei Lv
 * @create: 2019/11/02
 **/

public class MainTest {

    public static void clear(){
        try
        {
            String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (Exception exception)
        {
            //  Handle exception.
        }
    }

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
        System.out.println("Which design pattern do you want to test? [0 to quit]");
    }
    public static void main(String[] args) {

        boolean flag = true;
        int opCode;
        Scanner input = new Scanner(System.in);

        do{
//            clear();
            display_interface();
            opCode = input.nextInt();

            switch (opCode){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 23:
                    break;
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;
                case 27:
                    break;
                case 28:
                    break;
                default:
                    System.out.println("Invalid input!");
                    System.out.println("Please input again!");
            }

        }while(flag);

        System.out.println("");
        System.out.println("========= End of Design Patterns Test ==========");

    }
}
