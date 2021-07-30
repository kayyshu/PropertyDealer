package test;
import custom.functions.*;

import java.io.*;
import java.util.Scanner;


public class test {

    public static void main(String[] args) throws FileNotFoundException {
        PropertyFromCSV propertyFromCSV =new PropertyFromCSV();
        VendorFromCSV vendorFromCSV =new VendorFromCSV();
        ContractFromCSV contractFromCSV= new ContractFromCSV();
        SaleFromCSV saleFromCSV=new SaleFromCSV();
        DisplayProperty displayProperty= new DisplayProperty();

        System.out.println(propertyFromCSV.getNumberOfProperties("/Users/apple/IdeaProjects/Solution/resource/properties.csv") +" properties loaded.");
        System.out.println(vendorFromCSV.getNumberOfVendors("/Users/apple/IdeaProjects/Solution/resource/vendors.csv") +" vendors loaded.");
        System.out.println(contractFromCSV.getNumberOfContracts("/Users/apple/IdeaProjects/Solution/resource/contracts.csv") +" contracts loaded.");
        System.out.println(saleFromCSV.getNumberOfSales("/Users/apple/IdeaProjects/Solution/resource/sales.csv") +" sales loaded.");

        System.out.println("");
        System.out.println("1) Display Properties");
        System.out.println("2) Enter a new 'Property for Sale'");
        System.out.println("3) Record a property as 'Sold'");
        System.out.println("4) Generate Financial Report");
        System.out.println("5) Generate Similar Property Report");
        System.out.println("6) Save Data");
        System.out.println("7) Exit the program");

        Scanner scanner= new Scanner(System.in);

        if (scanner.nextInt() == 1) {
            System.out.println("I) Display All Properties");
            System.out.println("II) Display sold Properties");
            System.out.println("III) Display for Sale Properties");
            System.out.println("IV) Display Withdrawn Properties");
            if ("I".equals(scanner.next())) {
                displayProperty.displayAllProperty("/Users/apple/IdeaProjects/Solution/resource/properties.csv","","","");
            }
            else if("II".equals(scanner.next())){
                displayProperty.displaySoldProperty();
            }
            else if("III".equals(scanner.next())){
                displayProperty.displayForSaleProperty();
            }
            else{
                displayProperty.displayWithdrawnProperty();
            }
        }








    }
}
