package test;

import main.java.com.familyFarmSeaside.person.worker.shortTerm.ioc.ClassPathXmlApplicationContext;

/**
 * @program: FamilyFarmSeaside
 * @description: To test IOC pattern
 * @author: Zijian Zhang
 * @create: 2019/10/27
 **/
public class IOCTest {
  public static void main(String[] args){
    System.out.println("——————————————————测试IOC模式————————————————————");
    ClassPathXmlApplicationContext.main(new String[]{});
    System.out.println("--------------------------------------------------");
  }
}
