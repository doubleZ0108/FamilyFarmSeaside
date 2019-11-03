package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.Animal.Action.Shower.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: The test for Chain Of Responsibility pattern.
 * @author: stern
 * @create: 2019/10/27
 **/
public class ChainOfResponsibilityTest {
    private static Map<String, Shower> showerPatterns = new HashMap<String, Shower>();

    public static void setNode() {
        /**
         * @description: Create a Shower Node with requirements.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入创建节点ShowerPattern的编号（'0'除外）：");
        String no = sc.next();
        while(no.equals("0")) {
            System.out.println("该编号不可使用。");
            System.out.println("请输入创建节点ShowerPattern的编号（'0'除外）：");
            no = sc.next();
        }
        while(showerPatterns.get(no) != null) {
            System.out.println("该编号已被使用。");
            System.out.println("请输入创建节点ShowerPattern的编号（'0'除外）：");
            no = sc.next();
        }

        Shower showerNode = new ShowerPattern(no);
        while(true) {
            System.out.println("请选择操作：[0 退出适用动物设置流程 | " +
                    "1 添加一个适用动物 | 2 删除一个适用动物 | " +
                    "3 查看所有适用动物]");
            String choice = sc.next();
            if(choice.equals("1")) {
                System.out.println("请输入动物名称：");
                String name = sc.next();
                showerNode.addAnimalName(name);
            }
            else if(choice.equals("2")) {
                System.out.println("请输入动物名称：");
                String name = sc.next();
                if(!showerNode.removeAnimalName(name)){
                    System.out.println("该模式原本就不适用于这种动物。");
                };
            }
            else if(choice.equals("3")) {
                showerNode.showAnimalName();
            }
            else if(choice.equals("0")){
                break;
            }
            else {
                System.out.println("不规范输入。");
            }
        }
        showerPatterns.put(no, showerNode);
    }


    public static void setNext() {
        /**
         * @description: Let users point out the front & next node to generate a chain between two nodes.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成链的前驱节点编号（输入'0'退出操作）：");
        String front = sc.next();
        if(front.equals("0")) {
            return;
        }
        Shower frontNode = showerPatterns.get(front);
        while(frontNode == null) {
            System.out.println("不存在该节点。");
            System.out.println("请输入成链的前驱节点编号（输入'0'退出操作）：");
            front = sc.next();
            if(front.equals("0")) {
                return;
            }
            frontNode = showerPatterns.get(front);
        }

        System.out.println("请输入成链的后继节点编号（输入'0'退出操作）：");
        String next = sc.next();
        if(next.equals("0")) {
            return;
        }
        Shower nextNode = showerPatterns.get(next);
        while(nextNode == null) {
            System.out.println("不存在该节点。");
            System.out.println("请输入成链的后继节点编号（输入'0'退出操作）：");
            next = sc.next();
            if(next.equals("0")) {
                return;
            }
            nextNode = showerPatterns.get(next);
        }

        frontNode.setSuccessor(nextNode);
    }


    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Chain of Responsibility]Pattern —————————————-------------------------------------————");


        System.out.println("Shower : addAnimalName() : Add a name to the list of animals' names.");
        System.out.println("Shower : setSuccessor() : Set the successor's responsibility object.");
        System.out.println("Shower : showAnimalName() : Show animal name.");
        System.out.println("Shower : selectPattern() : Call animal shower method, scan chain give feedback.");
        System.out.println("");


        String choice;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择操作：[1 新建Shower节点 | 2 链接两个节点 | 3 查询动物的ShowerPattern | 0]");
            choice = sc.next();
            if(choice.equals("1")) {
                setNode();
            }
            else if(choice.equals("2")) {
                setNext();
            }
            else if(choice.equals("3")) {
                boolean exit = false;
                System.out.println("请选择作为查询起点的节点编号（输入'0'退出操作）：");
                String no = sc.next();
                if(no.equals("0")) {
                    continue;
                }
                Shower root = showerPatterns.get(no);
                while(root == null) {
                    System.out.println("不存在该节点。");
                    System.out.println("请选择作为查询起点的节点编号（输入'0'退出操作）：");
                    no = sc.next();
                    if(no.equals("0")) {
                        exit = true;
                        break;
                    }
                    root = showerPatterns.get(no);
                }
                if(exit) {
                    continue;
                }
                System.out.println("请选择待查询的动物名称：");
                String name = sc.next();
                root.selectPattern(name);
            }
            else if(choice.equals("0")) {
                break;
            }
            else {
                System.out.println("不规范输入。");
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
