package main.java.com.familyFarmSeaside.Supply.Visitor;

import main.java.com.familyFarmSeaside.Supply.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @program: FamilyFarmSeaside
 * @description:
 * @author: Yimo Liu
 * @create: 2019/10/30
 **/
public class ObjectStructure {
    private List<Element> EleList=new ArrayList<Element>();
    public void accept(SupplyVisitor visitor)
    {
        LinkedBlockingQueue<Object> list;
        Iterator<Element> i=this.EleList.iterator();
        while(i.hasNext())
        {
            ((Element) i.next()).accept(visitor);
        }
    }
    public void add(Element element)
    {
        this.EleList.add(element);
    }
    public void remove(Element element)
    {
        this.EleList.remove(element);
    }
}