package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class ProfitLoss{
    public static void main(String []args){
        int sellingPrice=191;
        int costPrice=129;
        int profit=sellingPrice-costPrice;
        double profitPercent=(double)profit/costPrice * 100;
        System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice);
        System.out.println("The Profit is INR"+profit+" and the Profit Percentage is "+profitPercent);

    }
}
