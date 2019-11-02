package main.java.com.familyFarmSeaside.Supply.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: FamilyFarmSeaside
 * @description:Terminal expression, implements the interface Expression.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class TerminalExpression implements  Expression
{
    private Set<String> set = new HashSet<String>();

    public TerminalExpression(Set<String> ps)
    {
        for(String s : ps)
        {
            set.add(s);
        }
    }

    //检查终结符集合中是否有对应元素
    @Override
    public boolean interpret(String info)
    {
        if(set.contains(info))
        {
            return true;
        }
        return false;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "class TerminalExpression implements  Expression";
    }
}