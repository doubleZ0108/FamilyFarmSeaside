package main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan;

import main.java.com.familyFarmSeaside.Plant.Mediator.PollinationMediator;

/**
 * @program: FamilyFarmSeaside-master
 * @description: stamen of flower
 * @author: Di
 * @create: 2019/10/30
 **/
public class Stamen extends ReproductiveOrgan {

    /**
     * Constructor
     */
    public Stamen() {
        this.setState(FlowerState.IMMATURE);
    }

    /**
     * get the type of the flower, pistil or stamen
     * @return the type of the flower
     */
    @Override
    public String getType() {
        return "Stamen";
    }

    /**
     * get the state of the stamen
     * @return the state of the stamen
     */
    @Override
    public FlowerState getState() {
        return this.state;
    }

    /**
     * set the state of the stamen
     * @param fs new state
     */
    @Override
    public void setState(FlowerState fs) {
        this.state = fs;
    }

    /**
     * pollination fot the stamen
     */
    @Override
    public void pollinate() {
        this.setState(FlowerState.MATURE);
    }

    /**
     * pollination
     * correspond with the mediator, find 3 immature pistil
     * @param pm pollination mediator
     */
    public void pollinate(PollinationMediator pm) {
        this.pollinate();
        pm.stamenAffectPistil();
    }

    /**
     * show stamen message
     */
    @Override
    public void showMessage() {
        System.out.println("this is a stamen.");
    }
}
