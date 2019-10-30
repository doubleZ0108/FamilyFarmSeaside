package main.java.com.familyFarmSeaside.Transaction;

import main.java.com.familyFarmSeaside.Product.ProductList;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: FamilyFarmSeaside
 * @description: Transaction records: Memento in Memento Pattern
 * @author: Xuefei Lv
 * @create: 2019/10/29
 **/

public class TransationRecords {
    //存储交易记录：时间、交易产品、买入or卖出
    static enum SellOrBuy{SELL,BUY}

    Date date;
    String product;
    int unitPrice;
    int number;
    int transactionAmount;
    SellOrBuy sellOrBuy;
    int money;
    ProductList productList;

    public ProductList getProductList(){return productList;}

    public TransationRecords(String product, SellOrBuy sellOrBuy, int number, int unitPrice, int money, ProductList productList){
        this.date = new Date();
        this.product=product;
        this.sellOrBuy=sellOrBuy;
        this.number = number;
        this.unitPrice = unitPrice;
        this.transactionAmount = unitPrice*number;
        this.money = money;
        this.productList = productList;
    }

    public void printRecordsInfo(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        System.out.println("日期："+sdf.format(this.date));
        System.out.println("交易产品："+this.product);
        System.out.println("单价："+this.unitPrice);
        System.out.println("交易数量："+this.number);
        System.out.println("交易金额："+this.transactionAmount);
        System.out.println("交易类型："+this.sellOrBuy.toString());
        System.out.println("剩余财产："+this.money);
    }

}
