package main.java.com.familyFarmSeaside.Plant.Mediator;

import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.FlowerState;
import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.Pistil;
import main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan.Stamen;

/**
 * @program: FamilyFarmSeaside-master
 * @description: mediator for pollination
 * @author: Di
 * @create: 2019/10/30
 **/
public class PollinationMediator implements Mediator {

    /**
     * one stamen
     */
    protected Stamen stamen;

    /**
     * three pistils
     */
    protected Pistil pistl;

    /**
     * Constructor
     * @param stamen the stamen
     * @param pistil the pistil
     */
    public PollinationMediator(Stamen stamen, Pistil pistil) {
        this.stamen = stamen;
        this.pistl = pistil;
    }

    /**
     * set the stamen of the mediator
     * @param s new stamen
     */
    public void setStamen(Stamen s) {
        this.stamen = s;
    }

    /**
     * set the pistil of the mediator
     * @param p new pistil
     */
    public void setPistl(Pistil p) {
        this.pistl = p;
    }

    /**
     * the effect that pistil got from stamen, actually getting the pollen
     */
    public void stamenAffectPistil() {
        this.pistl.setState(FlowerState.MATURE);
    }

    /**
     * the effect that stamen got from pistil, actually nothing
     */
    public void pistilAffectStamen() {
        // do nothing
    }
}
