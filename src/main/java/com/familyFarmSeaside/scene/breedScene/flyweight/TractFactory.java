package main.java.com.familyFarmSeaside.scene.breedScene.flyweight;

import java.util.Hashtable;

public class TractFactory {
    private Hashtable<String, Tract> tracts = new Hashtable<String, Tract>();

    private static TractFactory singleton= new TractFactory();
    private TractFactory() { }
    public static TractFactory getInstance() {    return singleton; }

    public Tract getTract(String tractType){
        Tract tract = (Tract) tracts.get(tractType);
        if(tract == null){
            switch (tractType) {
                case "WasteTract":
                    tract = new WasteTract();
                    System.out.println("创建一个WasteTract实例");
                    tracts.put("WasteTract", tract);
                    break;
                case "CommonTract":
                    tract = new CommonTract();
                    System.out.println("创建一个CommonTract实例");
                    tracts.put("CommonTract", tract);
                    break;
                case "BlackTract":
                    tract = new BlackTract();
                    System.out.println("创建一个BlackTract实例");
                    tracts.put("BlackTract", tract);
                    break;
                default:
                    tract = null;
                    break;
            }
        }
        return tract;
    }
}
