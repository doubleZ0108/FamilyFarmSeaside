package test;

import main.java.com.familyFarmSeaside.Supply.Interpreter.Context;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test the interpreter pattern.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class InterpreterTest
{
    public static void main(String[] args) {
        Context farmContext = new Context();
        Scanner scanner = new Scanner(System.in);
        System.out.println("现在开始测试Interpreter设计模式！");
        //以下四个while用于输入
        while(true)
        {
            System.out.println("请输入低权限使用者（停止输入请输入“停止”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("停止")) break;
                else
                {
                    farmContext.addToLowGradePerson(s);
                }
            }
        }
        while(true)
        {
            System.out.println("请输入低权限工具（停止输入请输入“停止”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("停止")) break;
                else
                {
                    farmContext.addToLowGradeSupplies(s);
                }
            }
        }
        while(true)
        {
            System.out.println("请输入高权限使用者（停止输入请输入“停止”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("停止")) break;
                else
                {
                    farmContext.addToHighGradePerson(s);
                }
            }
        }
        while(true)
        {
            System.out.println("请输入高权限工具（停止输入请输入“停止”）");
            if(scanner.hasNext())
            {
                String s = scanner.next();
                if(s.equals("停止")) break;
                else
                {
                    farmContext.addToHighGradeSupplies(s);
                }
            }
        }
        farmContext.addIsOver();
        //判断“某人使用某物”是否合理
        while (true)
        {
            System.out.println("请以“某人使用某物”的形式输入测试语句！（停止输入请输入“停止”）");
            String s = scanner.next();
            if(s.equals("停止")) break;
            else
            {
                farmContext.allowUse(s);
            }
        }
        System.out.println("Interpreter设计模式测试完毕！");
    }
}