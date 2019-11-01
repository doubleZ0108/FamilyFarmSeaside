package main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan;

import main.java.com.familyFarmSeaside.Plant.Mediator.PollinationMediator;

/**
 * @program: FamilyFarmSeaside-master
 * @description: pistil of flower
 * @author: Di
 * @create: 2019/10/30
 **/
public class Pistil extends ReproductiveOrgan {

    /**
     * Constructor
     */
    public Pistil(){
        this.setState(FlowerState.IMMATURE);
    }

    /**
     * get the type of the flower, stamen or pistil
     * @return the type of the flower
     */
    @Override
    public String getType() {
        return "Pistil";
    }

    /**
     * get the state of the pistil
     * @return the state of the pistil
     */
    @Override
    public FlowerState getState() {
        return this.state;
    }

    /**
     * set the state of the pistil
     * @param fs new state
     */
    @Override
    public void setState(FlowerState fs) {
        this.state = fs;
    }

    /**
     * pollination for the pistil
     * it gets the pollen from one stamen
     */
    @Override
    public void pollinate() {
        this.setState(FlowerState.MATURE);
    }

    /**
     * pollination
     * correspond with the mediator, actually do nothing
     * @param pm pollination mediator
     */
    public void pollinate(PollinationMediator pm) {
        this.pollinate();
        pm.pistilAffectStamen();
    }

    /**
     * show pistil message
     */
    @Override
    public void showMessage() {
        System.out.println("this is a pistil.");
    }
}
