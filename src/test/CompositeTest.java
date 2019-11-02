package test;

import main.java.com.familyFarmSeaside.Plant.Vegetable.DetailVegetable.Succulent.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: The test class for composition method.
 * @author: stern
 * @create: 2019/10/27
 **/
public class CompositeTest {
    private static Map<String, SucculentCluster> succulentClusters = new HashMap<String, SucculentCluster>();
    private static Map<String, SucculentPlant> succulentPlants = new HashMap<String, SucculentPlant>();

    public static void createCluster() {
        /**
         * @description: Create a SucculentCluster Node with requirements.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入创建Cluster的编号：");
        String no = sc.next();
        while(succulentClusters.get(no) != null) {
            System.out.println("该编号已被使用。");
            System.out.println("请输入创建Cluster的编号：");
            no = sc.next();
        }

        SucculentCluster node = new SucculentCluster(no);
        succulentClusters.put(no, node);
    }

    public static void createPlant() {
        /**
         * @description: Create a SucculentPlant Node with requirements.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入创建Plant的名字：");
        String name = sc.next();
        while(succulentPlants.get(name) != null) {
            System.out.println("该名字已被使用。");
            System.out.println("请输入创建Plant的名字：");
            name = sc.next();
        }

        SucculentPlant node = new SucculentPlant(name);
        succulentPlants.put(name, node);
    }


    public static void addLeaf() {
        /**
         * @description: Add a leaf node (cluster or plant) into a root node (cluster).
         *
         * @return : void
         **/
        SucculentCluster rootNode;
        SucculentBonsai leafNode;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入根节点（只能是Cluster）编号：");
        String root = sc.next();
        rootNode = succulentClusters.get(root);
        while(rootNode == null) {
            System.out.println("不存在该节点。");
            System.out.println("请输入成链的前驱节点编号：");
            root = sc.next();
            rootNode = succulentClusters.get(root);
        }

        while(true) {
            System.out.println("请输入子节点种类：[0 Cluster多株 | 1 Plant单株]");
            String choice = sc.next();
            if(choice.equals("0")) {
                System.out.println("请输入Cluster的编号：");
                String no = sc.next();
                leafNode = succulentClusters.get(no);
                while(leafNode == null) {
                    System.out.println("不存在该节点。");
                    System.out.println("请输入Cluster的编号：");
                    no = sc.next();
                    leafNode = succulentClusters.get(no);
                }
                break;
            }
            else if(choice.equals("1")){
                System.out.println("请输入Plant的名字：");
                String name = sc.next();
                leafNode = succulentPlants.get(name);
                while(leafNode == null) {
                    System.out.println("不存在该节点。");
                    System.out.println("请输入Plant的名字：");
                    name = sc.next();
                    leafNode = succulentPlants.get(name);
                }
                break;
            }
            else {
                System.out.println("不规范输入。");
            }
        }
        rootNode.add(leafNode);
    }

    public static void showLeaf() {
        /**
         * @description: Show the tree structure.
         *
         * @return : void
         **/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入根节点（只能是Cluster）编号：");
        String root = sc.next();
        SucculentCluster rootNode = succulentClusters.get(root);
        while(rootNode == null) {
            System.out.println("不存在该节点。");
            System.out.println("请输入成链的前驱节点编号：");
            root = sc.next();
            rootNode = succulentClusters.get(root);
        }

        System.out.println("查询节点内容：");
        rootNode.show();
    }


    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Composite]Pattern —————————————-------------------------------------————");


        System.out.println("SucculentCluster : add() : Add a element to the list of cluster.");
        System.out.println("SucculentCluster : show() : Show all elements in the list of cluster.");
        System.out.println("SucculentPlant : add() : Add a element to the list of plant.");
        System.out.println("SucculentPlant : show() : Show all elements in the list of plant.");
        System.out.println("");

        String choice;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择操作：[1 新建Cluster(Multiple)节点 | 2 新建Plant(Single)节点 | 3 往根节点中添加叶节点 | 4 查看树型结构 | 0]");
            choice = sc.next();
            if(choice.equals("1")) {
                createCluster();
            }
            else if(choice.equals("2")) {
                createPlant();
            }
            else if(choice.equals("3")) {
                addLeaf();
            }
            else if(choice.equals("4")) {
                showLeaf();
            }
            else if(choice.equals("0")) {
                break;
            }
            else {
                System.out.println("不规范输入。");
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}