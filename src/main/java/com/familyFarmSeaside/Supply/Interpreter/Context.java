package main.java.com.familyFarmSeaside.Supply.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: FamilyFarmSeaside
 * @description:The context class, the context of the interpreter pattern.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class Context
{
    private Set<String> low_grade_person = new HashSet<String>();
    private Set<String> low_grade_supplies = new HashSet<String>();
    private Expression low_grade_use = null;//low grade person can only use low grade supplies

    private Set<String> high_grade_person = new HashSet<String>();
    private Set<String> high_grade_supplies = new HashSet<String>();
    private Expression high_grade_use = null;//high grade person can use all supplies

    public Context()
    {
        low_grade_use = new AndExpression();
        high_grade_use = new AndExpression();
    }

    public void addToLowGradePerson(String p)
    {
        low_grade_person.add(p);
    }

    public void addToLowGradeSupplies(String s)
    {
        low_grade_supplies.add(s);
        high_grade_supplies.add(s);
    }

    public void addToHighGradePerson(String p)
    {
        high_grade_person.add(p);
    }

    public void addToHighGradeSupplies(String s)
    {
        high_grade_supplies.add(s);
    }

    public void addIsOver()
    {
        TerminalExpression lp = new TerminalExpression(low_grade_person);
        TerminalExpression ls = new TerminalExpression(low_grade_supplies);
        low_grade_use = new AndExpression(lp, ls);
        TerminalExpression hp = new TerminalExpression(high_grade_person);
        TerminalExpression hs = new TerminalExpression(high_grade_supplies);
        high_grade_use = new AndExpression(hp, hs);
    }

    public void allowUse(String info)
    {
        boolean ok = low_grade_use.interpret(info)||high_grade_use.interpret(info);
        if(ok)
        {
            System.out.println(info + "是允许的");
        }
        else
        {
            System.out.println(info + "是不允许的");
        }
    }
}