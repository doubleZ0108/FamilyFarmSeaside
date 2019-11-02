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
    private Expression person = null;
    private Expression supply = null;

    public AndExpression(){}

    public AndExpression(Expression person, Expression supply)
    {
        this.person = person;
        this.supply = supply;
    }

    //按照句子格式拆分句子，检查两个Expression对于对应元素的interpret是否能通过
    @Override
    public boolean interpret(String info)
    {
        String s[] = info.split("使用");
        try
        {
            return person.interpret(s[0])&&supply.interpret(s[1]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("请以“某人使用某物”的格式输入！！");
            return false;
        }
    }

    public Expression getPerson() {
        return person;
    }

    public void setPerson(Expression person) {
        this.person = person;
    }

    public Expression getSupply() {
        return supply;
    }

    public void setSupply(Expression supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "class AndExpression implements Expression";
    }
}