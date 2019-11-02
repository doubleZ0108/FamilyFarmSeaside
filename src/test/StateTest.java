package test;
import main.java.com.familyFarmSeaside.Supply.*;
import main.java.com.familyFarmSeaside.Supply.State.ToolContext;
import main.java.com.familyFarmSeaside.Supply.Tool.Tool;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test of State pattern
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class StateTest {
    public static void stateChanges()
    {
        Tool TestTool=new Tool();
        System.out.println("----------------Proxy Test---------------");
        System.out.println("**      1 --- Alter the durability     **");
        System.out.println("**      2 --- Show the current state   **");
        System.out.println("**      3 --- Exit                     **");
        System.out.println("-----------------------------------------");

        System.out.println("Create a new tool! And its state is: "+TestTool.getContext().getState().getStateName());

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.print("Input your order：");
            int order = sc.nextInt();
            switch (order) {
                case 1: {
                    Scanner input = new Scanner(System.in);
                    System.out.println("");
                    System.out.print("Input your value of altering：");
                    int val = input.nextInt();
                    TestTool.getContext().alter(val);
                    break;
                }
                case 2: {
                    float dura = TestTool.getContext().getState().getDurability();
                    String state = TestTool.getContext().getState().getStateName();
                    System.out.println("Durability: "+dura+", state: "+state);
                    break;
                }
                case 3: {
                    return;
                }
                default: {
                    System.out.println("Invalid input!\n");
                }
            }
        }
    }

    public static void main(String []args){
        System.out.println("—————————————-------------------------------------———— Test[State]Pattern —————————————-------------------------------------————");

        System.out.println("Tool : tool() : Inherited from Supply, create instance of Tool.");
        System.out.println("Tool : getContext() : Inherited from Supply, get the context of this Tool");
        System.out.println("ToolContext : getState() : Get the state of this context of this Tool");
        System.out.println("ToolContext : alter() : Alter the value of durability of this context, which may lead to the changing of the state.");
        System.out.println("AbstractToolState : getStateName() : Get the name of this very State.");
        System.out.println("");

        StateTest.stateChanges();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}