package main.java.com.familyFarmSeaside.Supply.Interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: FamilyFarmSeaside
 * @description:Nonterminal expression, implements the interface Expression.
 * @author: Yifan Ye
 * @create: 2019/10/28
 **/
public class AndExpression implements Expression
{
    private Set<String> set = new HashSet<String>();


    @Override
    public boolean interpret(String info) {
        return false;
    }
}