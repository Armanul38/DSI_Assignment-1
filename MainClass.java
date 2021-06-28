/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation operation=new Operation();
        while(true){
        //Show instraction    
        instruction();
        int option = Integer.parseInt(scanner.nextLine());
        //For Exit
        if(option==0){
            break;
        }
        
        switch(option){
            //Adding Product
            case 1:{
                System.out.println("Enter product name: ");
                int product_name=input();
                
                System.out.println("Enter Buying Price: ");
                int price_buy=input();
                
                System.out.println("Enter Selling Price: ");
                int price_sell=input();
                
                System.out.println("Enter Amount: ");
                int amount=input();
                
                //if press enter without entering value
                if(product_name==-1 || price_buy==-1 || price_sell==-1 || amount==-1)
                {
                    System.out.println("There is  missing value.product doesn't add to the list");
                    continue;
                }
                
                operation.AddProduct(product_name,price_buy,price_sell,amount);
                break;
            }
            //Deleting Product
            case 2:{
                System.out.println("Enter Product name: ");
                int product_name=Integer.parseInt(scanner.nextLine());
                
                operation.DeleteProduct(product_name);
                break;
            }
            //Buying Product
            case 3:{
                System.out.println("Enter Product name: ");
                int product_name=Integer.parseInt(scanner.nextLine());
                
                System.out.println("Enter Product Amount: ");
                int amount=Integer.parseInt(scanner.nextLine());
                
                operation.ProductBuy(product_name, amount);
                break;
                
            }
            //Selling Product
            case 4:{
                System.out.println("Enter Product name: ");
                int product_name=input();
                
                System.out.println("Enter Product Amount: ");
                int amount=input();
                
                operation.ProductSell(product_name, amount);
                break;
            }
            //Show Available Product
            case 5:{
                operation.showAvailableProduct();
                break;
            }
            //Show Available Balance
            case 6:{
                int balance=AvailableBalance.totalBalance;
                System.out.println("Available Balance: "+balance);
                break;
            }
            //when entering value less than 0 and greater than 6
            default:{
                System.out.println("Please Enter a Valid Option between 1 to 6");
            }
        }
        }
        }
    
    //It is handle when press enter without entering value problem
    public static int input(){
        int value=-1;
        try{
            Scanner scanner = new Scanner(System.in);
            value=Integer.parseInt(scanner.nextLine());
        }catch(Exception e){
            System.out.println("please enter a value");
        }
        return value;
    }
    
    //Show the instruction
    public static void instruction(){
        System.out.println("Please Choose any of the options below ");
        System.out.println("Enter 0 to exit.");
        
        System.out.println("1. Add a Product");
        System.out.println("2. Delete a Product");
        System.out.println("3. Buy a Product");
        System.out.println("4. Sell a Product");
        System.out.println("5. Show Available Product List");
        System.out.println("6. Show Available Balance");
           
    }
}
