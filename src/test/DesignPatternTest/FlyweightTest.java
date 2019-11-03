package test.DesignPatternTest;

import main.java.com.familyFarmSeaside.scene.breedScene.Farmland;
import main.java.com.familyFarmSeaside.scene.breedScene.flyweight.BlackTract;
import main.java.com.familyFarmSeaside.scene.breedScene.flyweight.Tract;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test the flyweight pattern.
 * @author: Yimin Li
 * @create: 2019/10/19
 **/
public class FlyweightTest {
    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— Test[Flyweight]Pattern —————————————-------------------------------------————");
        System.out.println("Farmland : setTract() : The Farmland with the coordinates of (loc_x, loc_y) is set to Tract of type tractType.");
        System.out.println("Farmland : getCanvas() : Export the image of Farmland to the console.");
        System.out.println("Farmland : Farmland() : Constructor of Farmland class, it creates 12 WasteTract by default.");
        System.out.println("");

        /**
         * create a farmland
         */
        System.out.println("系统已为你创建一个farmland实例，其由12个土地块构成，大小为3*4的矩阵，默认所有土地块块均为荒地，其俯视图如下：");
        Farmland farmland = new Farmland();
        /**
         * output the initial vertical view of the farmland in the console.
         */
        Character[][] canvas = farmland.getCanvas();
        for(int i = 0; i < farmland.getWidth()* Tract.sideLength; i++){
            for(int j = 0; j < farmland.getLength()*Tract.sideLength; j++) {
                System.out.print(canvas[i][j]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }

        /**
         * it's time for the tester to choose an option!
         */
        Scanner scanner = new Scanner(System.in);
        int option;
        while(true){
            System.out.println("请选择操作[1 设置一个土地块 | 2 查看farmland俯视图 | 3 退出]");
            option = scanner.nextInt();
            if(option == 1){
                int loc_x, loc_y, TractType;
                System.out.println("请输入两个整数，用来表示要设置的土地块的坐标，第一个整数取值范围为0~3，第二个整数取值范围为0~2：");
                loc_x = scanner.nextInt();
                loc_y = scanner.nextInt();
                System.out.println("请选择要把这个土地块设置成什么类型[1 荒地 | 2 普通土地 | 3 黑土地]");
                TractType = scanner.nextInt();
                if(TractType == 1)
                    farmland.setTract(loc_x, loc_y, "WasteTract");
                else if(TractType == 2)
                    farmland.setTract(loc_x, loc_y, "CommonTract");
                else
                    farmland.setTract(loc_x, loc_y, "BlackTract");
            }
            else if(option == 2){
                canvas = farmland.getCanvas();
                for(int i = 0; i < farmland.getWidth()* Tract.sideLength; i++){
                    for(int j = 0; j < farmland.getLength()*Tract.sideLength; j++) {
                        System.out.print(canvas[i][j]);
                        System.out.print(' ');
                    }
                    System.out.print('\n');
                }
            }
            else if(option == 3)
                break;
        }
    }
}
