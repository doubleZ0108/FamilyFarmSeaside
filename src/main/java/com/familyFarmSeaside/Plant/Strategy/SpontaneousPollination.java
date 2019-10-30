package main.java.com.familyFarmSeaside.Plant.Strategy;

import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Apple;
import main.java.com.familyFarmSeaside.Plant.Fruit.DetailFruit.Cherry;
import main.java.com.familyFarmSeaside.Plant.Mediator.PollinationMediator;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Potato;
import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Tomato;

/**
 * @program: FamilyFarmSeaside-master
 * @description: spontaneous pollination strategy
 * @author: Di
 * @create: 2019/10/30
 **/
public class SpontaneousPollination implements PollinationStrategy {

    /**
     * spontaneous pollination for one single apple
     * @param a the specific apple
     */
    @Override
    public void pollinate(Apple a) {
        if (a.isMature()) {
            PollinationMediator pm = new PollinationMediator(a.flower.getStamen(), a.flower.getPistil());

            a.flower.getStamen().pollinate(pm);
            a.flower.getPistil().pollinate(pm);

            System.out.println("one apple is successfully spontaneous pollinated.");
            a.plantState.moveToNext(a);
        } else if (a.isDead()) {
            // do nothing
        } else {
            System.out.println("this plant can't be pollinated! find another one.");
        }
    }

    /**
     * spontaneous pollination for one single cherry
     * @param c the specific cherry
     */
    @Override
    public void pollinate(Cherry c) {
        if (c.isMature()) {
            PollinationMediator pm = new PollinationMediator(c.flower.getStamen(), c.flower.getPistil());

            c.flower.getStamen().pollinate(pm);
            c.flower.getPistil().pollinate(pm);

            System.out.println("one cherry is successfully spontaneous pollinated.");
            c.plantState.moveToNext(c);
        } else if (c.isDead()) {
            // do nothing
        } else {
            System.out.println("this plant can't be pollinated! find another one.");
        }
    }

    /**
     * spontaneous pollination for one single potato
     * @param p the specific potato
     */
    @Override
    public void pollinate(Potato p) {
        if(p.isMature()) {
            PollinationMediator pm = new PollinationMediator(p.flower.getStamen(), p.flower.getPistil());

            p.flower.getStamen().pollinate(pm);
            p.flower.getPistil().pollinate(pm);

            System.out.println("one potato is successfully spontaneous pollinated.");
            p.plantState.moveToNext(p);
        } else if (p.isDead()) {
            // do nothing
        } else {
            System.out.println("this plant can't be pollinated! find another one.");
        }
    }

    /**
     * spontaneous pollination for one single tomato
     * @param t the specific tomato
     */
    @Override
    public void pollinate(Tomato t) {
        if(t.isMature()) {
            PollinationMediator pm = new PollinationMediator(t.flower.getStamen(), t.flower.getPistil());

            t.flower.getStamen().pollinate(pm);
            t.flower.getPistil().pollinate(pm);

            System.out.println("one tomato is successfully spontaneous pollinated.");
            t.plantState.moveToNext(t);
        } else if (t.isDead()) {
            // do nothing
        } else {
            System.out.println("this plant can't be pollinated! find another one.");
        }
    }
}
