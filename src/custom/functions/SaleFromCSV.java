package custom.functions;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import custom.utils.Sale;


public class SaleFromCSV {
    public List<Sale> processCSVToSaleList(String filePath) throws FileNotFoundException {
        List < Sale > resultList = new ArrayList < Sale>() ;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Scanner scan = new Scanner(new File(filePath));
        try {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                resultList.add(new Sale(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]), lineArray[3], formatter.parse(lineArray[4])));
            }
        }
        catch(ParseException e){System.out.println("Java Date parse exception" + e);}
        return resultList;
    }

    public Integer getNumberOfSales(String filePath) throws FileNotFoundException {
        List<Sale> resultList = new ArrayList< Sale >();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Scanner scan = new Scanner(new File(filePath));
        try {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                resultList.add(new Sale(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]), lineArray[3], formatter.parse(lineArray[4])));
            }
        }
        catch(ParseException e){System.out.println("Java parse exception"+e);}
        return resultList.size();
    }
}
