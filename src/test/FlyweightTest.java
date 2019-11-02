package test;

import main.java.com.familyFarmSeaside.scene.breedScene.Farmland;
import main.java.com.familyFarmSeaside.scene.breedScene.flyweight.BlackTract;
import main.java.com.familyFarmSeaside.scene.breedScene.flyweight.Tract;

public class FlyweightTest {
    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— 测试[Flyweight]模式 —————————————-------------------------------------————");
        //新建一个farmland
        System.out.println("创建一个farmland实例");
        Farmland farmland = new Farmland();

        //设置两片普通土地，三片黑土地
        farmland.setTract(1, 0, "CommonTract");
        farmland.setTract(2, 1, "CommonTract");
        farmland.setTract(1, 1, "BlackTract");
        farmland.setTract(3, 2, "BlackTract");
        farmland.setTract(0, 2, "BlackTract");


        //输出画布
        Character[][] canvas = farmland.getCanvas();
        for(int i = 0; i < farmland.getWidth()* Tract.sideLength; i++){
            for(int j = 0; j < farmland.getLength()*Tract.sideLength; j++) {
                System.out.print(canvas[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
