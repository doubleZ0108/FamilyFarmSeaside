package main.java.com.familyFarmSeaside.person.owner.command;

/**
 * @program: FamilyFarmSeaside
 * @description: The interface of Command
 * @author: Zijian Zhang
 * @create: 2019/10/23
 **/
@FunctionalInterface
public interface CommandWrapper {
  void execute();
}
