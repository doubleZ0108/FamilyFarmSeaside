package main.java.com.familyFarmSeaside.person.worker.shortTerm.aop;

/**
 * @program: NormalConstruction.java
 *
 * @description: Interface of normal construction.
 *
 * @author: Zhe Zhang
 *
 * @create: 2019/11/2
 **/
public interface NormalConstruction {
  // please pay attention to this interface
  // this is implemented by both all kinds of builder impl
  // this is not duplication!!!
  // but REQUIRED by the Java language in order to perform dynamic proxy
  public void buildSomeThingNormal();
}
