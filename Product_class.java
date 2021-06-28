/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lenovo
 */
public class Product_class {
    private int product_name;
    private int price_sell;
    private int price_buy;
    private int AvailableNumber;
    private int profit;
    
    Product_class(int product_name,int price_buy,int price_sell, int AvailableNumber){
        this.product_name=product_name;
        this.price_buy=price_buy;
        this.price_sell=price_sell;
        this.AvailableNumber=AvailableNumber;
        this.profit=0;
    }
    
    public int get_product_name(){
        return product_name;
    }
    
    public int get_AvailableNumber(){
        return AvailableNumber;
    }
    
    public int get_price_sell(){
        return price_sell;
    }
    
    public int get_price_buy(){
        return price_buy;
    }
    public int get_profit(){
        return profit;
    }
    
    public void update_product_name(int product_name){
        this.product_name=product_name;
    }
    
    public void update_price_sell(int price_sell){
        this.price_sell=price_sell;
    }
    public void update_price_buy(int price_buy){
        this.price_buy=price_buy;
    }
    public void update_profit(int profit){
        this.profit=profit;
    }
    public void update_AvailableNumber(int number){
        AvailableNumber=number;
    }
    public void increased_AvailableNumber(int number){
        AvailableNumber+=number;
    }
    
    public void decreased_AvailableNumber(int number){
        AvailableNumber-=number;
    }
    
    
    
    
}
