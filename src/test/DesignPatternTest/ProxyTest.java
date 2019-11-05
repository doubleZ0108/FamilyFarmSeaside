package test.DesignPatternTest;
import main.java.com.familyFarmSeaside.Supply.Proxy.*;
import main.java.com.familyFarmSeaside.Supply.Tool.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test of Proxy pattern
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class ProxyTest {
    public static void runTest()
    {
        /**
         * @description: Run the test
         *

         *
         * @return : void
         **/

        List<ToolProxy> ProxyList = new ArrayList<ToolProxy>();

        System.out.println("----------------Proxy Test---------------");
        System.out.println("**      1 --- Show all information     **");
        System.out.println("**      2 --- Create a Tool            **");
        System.out.println("**      3 --- Take a Tool              **");
        System.out.println("**      4 --- Return a Tool            **");
        System.out.println("**      5 --- Exit                     **");
        System.out.println("-----------------------------------------");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.print("Input your order：");
            int order = 0;
            try{
                order = sc.nextInt();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid input!!!!!");
                System.out.println("");
            }catch (InputMismatchException e){
                System.out.println("Invalid input!!!!!");
                System.out.println("");
            }
            switch (order) {
                case 1: {
                    for (int i = 0; i < ProxyList.size(); i++) {
                        String State = new String();
                        Tool tool = ProxyList.get(i).getToolInstance();
                        if (tool.isOccupied()) {
                            State = "Taken";
                        } else {
                            State = "Not Taken";
                        }
                        System.out.println("Tool No." + (i + 1) + ", State: "+State);
                    }
                    break;
                }
                case 2: {
                    Tool tool = new Tool();
                    ToolProxy toolProxy = new ToolProxy(tool);
                    ProxyList.add(toolProxy);
                    System.out.println("Create a new Tool! It's tool No." + ProxyList.size());
                    break;
                }
                case 3: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the index of the Tool to take：");
                    try{
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ProxyList.size() + 1) {
                            ProxyList.get(tool_num - 1).take();
                        } else {
                            System.out.println("Invalid input!!!!!");
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Invalid input!!!!!");
                        System.out.println("");
                    }catch (InputMismatchException e){
                        System.out.println("Invalid input!!!!!");
                        System.out.println("");
                    }

                    break;
                }
                case 4: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the index of the Tool to return：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ProxyList.size() + 1) {
                            ProxyList.get(tool_num - 1).returnTool();
                        } else {
                            System.out.println("Invalid input!!!!!");
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Invalid input!!!!!");
                        System.out.println("");
                    }catch (InputMismatchException e){
                        System.out.println("Invalid input!!!!!");
                        System.out.println("");
                    }

                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("Invalid Input!\n");
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— 测试[Proxy]模式 —————————————-------------------------------------————");

        System.out.println("Tool : Tool() : Inherited from Supply, create an instance of Tool.");
        System.out.println("ToolProxy : ToolProxy() : Implements ToolSubjects, create an instance of ToolProxy and bind it to an Tool.");
        System.out.println("ToolProxy : take() : Implements ToolSubjects, take the tool through the proxy.");
        System.out.println("ToolProxy : returnTool() : Implements ToolSubjects, return the tool to the proxy.");
        System.out.println("");


        ProxyTest.runTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}