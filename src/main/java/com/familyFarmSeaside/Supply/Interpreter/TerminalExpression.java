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

    public TerminalExpression(String[] data)
    {
        for(int i = 0; i < data.length; i++)
        {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info)
    {
        if(set.contains(info))
        {
            return true;
        }
        return false;
    }
}