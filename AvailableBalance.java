/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class AvailableBalance {
    public static int totalBalance;
    
    public  void increasedBalance(int amount){
        totalBalance+=amount;
    }
    public void decreasedBalance(int amount){
        totalBalance-=amount;
    }
    
}
