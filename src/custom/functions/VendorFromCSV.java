package custom.functions;

import custom.utils.Vendor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendorFromCSV {
        public ArrayList<Vendor> processCSVToVendorList(String filePath) throws FileNotFoundException {
            ArrayList < Vendor > resultList = new ArrayList < Vendor > ();
            Scanner scan = new Scanner(new File(filePath));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                resultList.add(new Vendor(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], lineArray[3], lineArray[4]));
            }


            return resultList;
        }

    public Integer getNumberOfVendors(String filePath) throws FileNotFoundException {
        ArrayList<Vendor> resultList = new ArrayList < Vendor > ();
        Scanner scan = new Scanner(new File(filePath));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(",");
            resultList.add(new Vendor(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], lineArray[3],lineArray[4]));
        }
        return resultList.size();
    }


}
