package main.java.com.familyFarmSeaside.Plant.ReproductiveOrgan;


/**
 * @program: FamilyFarmSeaside-master
 * @description: flower, contain pistil and stamen
 * @author: Di
 * @create: 2019/10/30
 **/
public class Flower extends ReproductiveOrgan {

    /**
     * the stamen of the flower
     */
    private Stamen stamen;

    /**
     * the pistil of the flower
     */
    private Pistil pistil;

    public Flower() {
        this.addPistil(new Pistil());
        this.addStamen(new Stamen());
    }

    /**
     * get the stamen
     * @return the stamen
     */
    public Stamen getStamen() {
        return stamen;
    }

    /**
     * add a stamen
     * @param stamen to add
     */
    public void addStamen(Stamen stamen) {
        this.stamen = stamen;
    }

    /**
     * get the pistil
     * @return the pistil
     */
    public Pistil getPistil() {
        return pistil;
    }

    /**
     * add a pistil
     * @param pistil to add
     */
    public void addPistil(Pistil pistil) {
        this.pistil = pistil;
    }

    /**
     * get the type of the organ
     * @return the type of the organ
     */
    public String getType() {
        return "Flower";
    }

    /**
     * do pollination
     */
    @Override
    public void pollinate() {
        // do nothing
    }

    /**
     * get the state of the organ
     * @return state of the organ
     */
    @Override
    public FlowerState getState() {
        return this.state;
    }

    /**
     * set the state of the organ
     * @param fs new state
     */
    @Override
    public void setState(FlowerState fs) {
        this.state = fs;
    }

    /**
     * show flower message
     */
    @Override
    public void showMessage() {
        System.out.println("this is a flower.");
    }
}
