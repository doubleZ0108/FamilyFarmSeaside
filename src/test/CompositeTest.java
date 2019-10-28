package test;

import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Succulent.*;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for composition method.
 * @author: stern
 * @create: 2019/10/27
 **/
public class CompositeTest {
    public static void main(String[] args) {
        System.out.println("Making root SucculentBonsai...");
        SucculentCluster root = new SucculentCluster("root");
        SucculentCluster cluster1 = new SucculentCluster("cluster1");
        SucculentCluster cluster2 = new SucculentCluster("cluster2");
        SucculentPlant BurroTail = new SucculentPlant("Burro’s Tail");
        root.add(cluster1);
        root.add(cluster2);
        root.add(BurroTail);
        root.show();

        System.out.println();
        System.out.println("Making root SucculentBonsai...");
        // Jade Plant, Panda Plant, Roseum
        SucculentPlant Jade = new SucculentPlant("Jade Plant");
        SucculentPlant Panda = new SucculentPlant("Panda Plant");
        SucculentPlant Roseum = new SucculentPlant("Roseum");
        cluster1.add(Jade);
        cluster1.add(Panda);
        cluster2.add(Roseum);
        System.out.println("Show Cluster1:");
        cluster1.show();
        System.out.println("Show Root:");
        root.show();

    }
}