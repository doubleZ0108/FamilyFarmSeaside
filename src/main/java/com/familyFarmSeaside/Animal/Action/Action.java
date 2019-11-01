package main.java.com.familyFarmSeaside.Animal.Action;

/**
 * @program: FamilyFarmSeaside
 * @description: The different actions animals can make.
 * @author: stern
 * @create: 2019/10/27
 **/
public abstract class Action {
    private String name;

    public Action() {}
    public Action(String name) {
        this.name = name;
    }

    abstract public void makeAction();

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "abstract class Action";
    }
}