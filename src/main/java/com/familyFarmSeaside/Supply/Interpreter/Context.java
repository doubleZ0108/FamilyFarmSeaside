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

    //向低权限使用者中加入元素
    public void addToLowGradePerson(String p)
    {
        low_grade_person.add(p);
    }

    //向低权限物品中加入元素
    public void addToLowGradeSupplies(String s)
    {
        low_grade_supplies.add(s);
        high_grade_supplies.add(s);
    }

    //向高权限使用者中加入元素
    public void addToHighGradePerson(String p)
    {
        high_grade_person.add(p);
    }

    //向高权限物品中加入元素
    public void addToHighGradeSupplies(String s)
    {
        high_grade_supplies.add(s);
    }

    //结束添加过程，实例化AndExpression对象
    public void addIsOver()
    {
        TerminalExpression lp = new TerminalExpression(low_grade_person);
        TerminalExpression ls = new TerminalExpression(low_grade_supplies);
        low_grade_use = new AndExpression(lp, ls);
        TerminalExpression hp = new TerminalExpression(high_grade_person);
        TerminalExpression hs = new TerminalExpression(high_grade_supplies);
        high_grade_use = new AndExpression(hp, hs);
    }

    //判断使用关系是否成立
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

    public Set<String> getLow_grade_person() {
        return low_grade_person;
    }

    public void setLow_grade_person(Set<String> low_grade_person) {
        this.low_grade_person = low_grade_person;
    }

    public Set<String> getLow_grade_supplies() {
        return low_grade_supplies;
    }

    public void setLow_grade_supplies(Set<String> low_grade_supplies) {
        this.low_grade_supplies = low_grade_supplies;
    }

    public Expression getLow_grade_use() {
        return low_grade_use;
    }

    public void setLow_grade_use(Expression low_grade_use) {
        this.low_grade_use = low_grade_use;
    }

    public Set<String> getHigh_grade_person() {
        return high_grade_person;
    }

    public void setHigh_grade_person(Set<String> high_grade_person) {
        this.high_grade_person = high_grade_person;
    }

    public Set<String> getHigh_grade_supplies() {
        return high_grade_supplies;
    }

    public void setHigh_grade_supplies(Set<String> high_grade_supplies) {
        this.high_grade_supplies = high_grade_supplies;
    }

    public Expression getHigh_grade_use() {
        return high_grade_use;
    }

    public void setHigh_grade_use(Expression high_grade_use) {
        this.high_grade_use = high_grade_use;
    }

    @Override
    public String toString() {
        return "class Context";
    }
}