package main.java.com.familyFarmSeaside.person.worker.shortTerm.aop;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: FamilyFarmSeaside
 * @description: The supply team for all constructions.
 * @author: Zijian Zhang
 * @create: 2019/10/27
 **/
public class SupplyTeam implements InvocationHandler {
  private NormalConstruction shortTermWorker;

  public NormalConstruction doConstructionUnderQA(NormalConstruction shortTermWorker){
    this.shortTermWorker = shortTermWorker;
    return (NormalConstruction) Proxy.newProxyInstance(shortTermWorker.getClass().getClassLoader(),shortTermWorker.getClass().getInterfaces(),this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("[Supply] Project is not started. Supply Team is ready to serve!");
    method.invoke(shortTermWorker,args);
    System.out.println("[Supply] Project is over. Supply team has finished its task!");
    return null;
  }
}
