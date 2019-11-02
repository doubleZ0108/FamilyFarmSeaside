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
    /**
     * @description: Create a proxy object. The user passes in the ShortTermWorker class object that needs to be proxied, and we will return a proxy object with the same interface. (The class to which the returned object belongs is created by the JVM at runtime)
     *
     * @param shortTermWorker : The short term Worker who belong to supply team and want to do construction under QA.
     *
     * @return : main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction
     **/
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

  public SupplyTeam(){
  }

  public SupplyTeam(NormalConstruction shortTermWorker) {
    this.shortTermWorker = shortTermWorker;
  }

  public NormalConstruction getShortTermWorker() {
    return shortTermWorker;
  }

  public void setShortTermWorker(NormalConstruction shortTermWorker) {
    this.shortTermWorker = shortTermWorker;
  }

  @Override
  public String toString() {
    return "class SupplyTeam implements InvocationHandler";
  }
}
