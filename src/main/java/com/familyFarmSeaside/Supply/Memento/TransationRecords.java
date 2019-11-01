package main.java.com.familyFarmSeaside.Supply.Memento;

import main.java.com.familyFarmSeaside.Product.ProductList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
    HashMap<String , List<HashMap<String,String >>> productInfo = new HashMap<>();

    public int getTransactionAmount(){return transactionAmount;}
    public int getMoney(){return  money;}
    public  SellOrBuy getSellOrBuy(){return sellOrBuy;}
    public  HashMap<String , List<HashMap<String,String >>>getProductInfo()
        {return this.productInfo;}

    public TransationRecords(String product, SellOrBuy sellOrBuy, int number, int unitPrice, int money, HashMap<String , List<HashMap<String,String >>> productInfo){
        this.date = new Date();
        this.product=product;
        this.sellOrBuy=sellOrBuy;
        this.number = number;
        this.unitPrice = unitPrice;
        this.transactionAmount = unitPrice*number;
        this.money = money;
        this.productInfo = productInfo;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setSellOrBuy(SellOrBuy sellOrBuy) {
        this.sellOrBuy = sellOrBuy;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setProductInfo(HashMap<String, List<HashMap<String, String>>> productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public String toString() {
        return "class TransationRecords";
    }
}
