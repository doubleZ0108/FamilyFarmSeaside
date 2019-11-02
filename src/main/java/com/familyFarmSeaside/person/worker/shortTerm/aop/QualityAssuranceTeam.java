package main.java.com.familyFarmSeaside.person.worker.shortTerm.aop;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: FamilyFarmSeaside
 * @description: The QA team of all construction.
 * @author: Zijian Zhang
 * @create: 2019/10/27
 **/
public class QualityAssuranceTeam implements InvocationHandler {
  private NormalConstruction shortTermWorker;

  public NormalConstruction doConstructionUnderQA(NormalConstruction shortTermWorker){
    /**
     * @description: Create a proxy object. The user passes in the ShortTermWorker class object that needs to be proxied, and we will return a proxy object with the same interface. (The class to which the returned object belongs is created by the JVM at runtime)
     *
     * @param shortTermWorker : The short term Worker who belong to quality assurance team and want to do construction under QA.
     *
     * @return : main.java.com.familyFarmSeaside.person.worker.shortTerm.aop.NormalConstruction
     **/
    this.shortTermWorker = shortTermWorker;
    return (NormalConstruction) Proxy.newProxyInstance(shortTermWorker.getClass().getClassLoader(),shortTermWorker.getClass().getInterfaces(),this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("[QA] Project is not started. QA Team is working on creating some test");
    method.invoke(shortTermWorker,args);
    System.out.println("[QA] Project is over. QA Team is verifying all kinds of issues");
    return null;
  }

  public QualityAssuranceTeam(){
  }

  public QualityAssuranceTeam(NormalConstruction shortTermWorker) {
    this.shortTermWorker = shortTermWorker;
  }

  @Override
  public String toString() {
    return "class QualityAssuranceTeam implements InvocationHandler";
  }
}
