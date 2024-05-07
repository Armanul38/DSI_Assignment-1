/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lenovo
 */
public class Operation {

   
    
    private HashMap <Integer, Product_class> productList = new HashMap <Integer, Product_class > ();  // track product name
    
    public void AddProduct(int productName,int price_buy,int price_sell,int AvailableNumber){
        Product_class product=new Product_class(productName,price_buy,price_sell,AvailableNumber);

        productList.put(productName,product);
        
    }
    
    public void DeleteProduct(int id){
        //System.out.println(id);
        if(find_product(id)==1){
            productList.remove(id);
        }
        else{
            System.out.println("There is no product Availabe now.Shouldn't delete product");
        }
    }
    
    
    public void ProductSell(int id,int amount){
        //System.out.println(id);
        if(productList.size()==0){
            System.out.println("There is no product available for selling");
            return;
        }
        
       if(find_product(id)==2){
            System.out.println("product is not available in productList");
        }
        else{
             Product_class soldProduct=productList.get(id);
             int count=soldProduct.get_AvailableNumber();
             if(count>=amount){
                 soldProduct.decreased_AvailableNumber(amount);
                 int profit=(amount*(soldProduct.get_price_sell()-soldProduct.get_price_buy()));
                 soldProduct.update_profit(profit);
                 //int number=count-amount;
                 //soldProduct.update_AvailableNumber(number);
                 int cost=amount*soldProduct.get_price_sell();
                 AvailableBalance balance=new AvailableBalance();
                 balance.increasedBalance(cost);
                 productList.remove(id);
                 productList.put(id, soldProduct);
             }
             else{
                 System.out.println("Product is available less than required amount");
             }
             
             
        }
    }
    
    public void ProductBuy(int id,int amount){
        
        Product_class buyProduct=productList.get(id);
        int cost=amount*buyProduct.get_price_buy();
        int availableBalance=AvailableBalance.totalBalance;
        if(availableBalance-cost>=0){
        buyProduct.increased_AvailableNumber(amount);
        productList.remove(id);
        productList.put(id,buyProduct);
        
        AvailableBalance balance=new AvailableBalance();
        balance.decreasedBalance(cost);
        }
        else{
            System.out.println("Sorry! Available Balance less than Required Balance");
        }
        
    }
    
    public void showAvailableProduct(){
        System.out.println("Product_Name"+"  "+"AvailableNumber"+"  "+"ProfitForEach");
        for (Map.Entry<Integer, Product_class> set : productList.entrySet()) {
                    Product_class product= set.getValue();
		    System.out.println(product.get_product_name() + "                  " + product.get_AvailableNumber()+"                  "+(product.get_profit()));
		}
    }
    
    int find_product(int id){
        if(productList.containsKey(id))
            return 1;
        else 
            return 2;
    }
    
    
}
