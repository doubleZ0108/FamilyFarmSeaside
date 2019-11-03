package test;

import main.java.com.familyFarmSeaside.scene.residence.ReceptionCenter;
import main.java.com.familyFarmSeaside.scene.residence.Residence;
import main.java.com.familyFarmSeaside.scene.residence.Villa;
import main.java.com.familyFarmSeaside.scene.residence.decorator.CentralAirCondition;
import main.java.com.familyFarmSeaside.scene.residence.decorator.InfraredAlarm;
import main.java.com.familyFarmSeaside.scene.residence.decorator.Monitor;

import java.util.Scanner;

/**
 * @program: FamilyFarmSeaside
 * @description: Test the decorator pattern.
 * @author: Yimin Li
 * @create: 2019/10/19
 **/
public class DecoratorTest {
    public static void main(String[] args){
        System.out.println("—————————————-------------------------------------———— Test[Decorator]Pattern —————————————-------------------------------------————");
        System.out.print("请选择要新建建筑[1 接待中心 | 2 豪宅]");
        Residence residence;
        Scanner reader=new Scanner(System.in);
        int i;
        while(true) {
            i = reader.nextInt();
            if (i == 1) {
                /**
                 * create a reception center without decorations
                 */
                residence = new ReceptionCenter();
                break;
            }
            else if (i == 2) {
                /**
                 * create a villa without decorations
                 */
                residence = new Villa();
                break;
            }
            else{
                System.out.println("输入的数字无效，请选择要新建建筑[1 接待中心 | 2 豪宅]");
            }
        }
        System.out.print("请选择操作[1 增加一个红外报警器 | 2 增加一个中央空调 | 3 增加一个监视器 | 4 显示建筑当前造价 | 5 退出]");
        while(true){
            i = reader.nextInt();
            if(i == 1){
                /**
                 * add an infrared alarm
                 */
                residence = new InfraredAlarm(residence);
            }
            else if(i == 2){
                /**
                 * add a central air condition
                 */
                residence = new CentralAirCondition(residence);
            }
            else if(i == 3){
                /**
                 * add a monitor
                 */
                residence = new Monitor(residence);
            }
            else if(i == 4){
                /**
                 * show the current proce of the house
                 */
                System.out.print(residence.getDescription());
                System.out.println("，其价格为" + residence.getCost());
            }
            else if(i == 5){
                break;
            }
            else{
                System.out.print("输入的数字无效，");
            }
            System.out.print("请选择操作[1 增加一个红外报警器 | 2 增加一个中央空调 | 3 增加一个监视器 | 4 显示建筑当前造价 | 5 退出]");
        }

//        //创建一个未加装饰地接待中心
//        Residence receptionCenter = new ReceptionCenter();
//        System.out.print(receptionCenter.getDescription());
//        System.out.println("，其价格为" + receptionCenter.getCost());
//        //给接待中心添加红外报警器
//        receptionCenter = new InfraredAlarm(receptionCenter);
//        System.out.print(receptionCenter.getDescription());
//        System.out.println("，其价格为" + receptionCenter.getCost() + '\n');
//
//
//        //创建一个未加装饰的豪宅
//        Residence villa = new Villa();
//        System.out.print(villa.getDescription());
//        System.out.println("，其价格为" + villa.getCost());
//        //给豪宅添加中央空调
//        villa = new CentralAirCondition(villa);
//        //给豪宅添加监视器
//        villa = new Monitor(villa);
//        System.out.print(villa.getDescription());
//        System.out.println("，其价格为" + villa.getCost() + '\n');
//        System.out.println("---------------------------------");

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
