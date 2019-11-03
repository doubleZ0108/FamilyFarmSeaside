package main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture;

import java.util.HashMap;

/**
 * @program: FamilyFarmSeaside
 * @description: 家具工厂类，用于维护一套家具对象的池，提供获取家具对象引用的函数
 * @author: saturn
 * @create: 2019/10/24
 **/
public class FurnitureFactory {
    private HashMap<FurnitureKind, Furniture> furniturePool;         //Pool for storing furniture objects
    private static FurnitureFactory furnitureFactory = new FurnitureFactory();  //furniture factory

    public FurnitureFactory(){furniturePool = new HashMap<>();}

    public static FurnitureFactory getInstance(){
        return furnitureFactory;
    }

    public Furniture getFurnitureByKind(FurnitureKind kind){
        /**
         * @description: Return some kind of furniture from the furniture pool.
         *
         * @param kind : The kind of furniture to be returned.
         *
         * @return : main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture.Furniture
         **/
        Furniture furniture = furniturePool.get(kind);
        if(furniture == null){
            furniture = createFurniture(kind);
            furniturePool.put(kind, furniture);
        }
        else {
            System.out.println(kind.toString() + " object shared, reference count + 1 = " + (furniture.getReferenceCount() + 1));
        }
        return furniture.getReference();
    }

    public Furniture createFurniture(FurnitureKind kind){
        /**
         * @description: Create the furniture instance according to the kind provided.
         *
         * @param kind : The kind of the furniture to be created.
         *
         * @return : main.java.com.familyFarmSeaside.scene.residence.dormitory.furniture.Furniture
         **/
        Furniture furniture = null;
        switch (kind){
            case Bed:
                furniture = new Bed();
                break;
            case Desk:
                furniture = new Desk();
                break;
            case Chair:
                furniture = new Chair();
                break;
        }
        return furniture;
    }
}
