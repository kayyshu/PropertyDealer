package custom.functions;

import custom.utils.Contract;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContractFromCSV {

    public ArrayList<Contract> processCSVToContractList(String filePath) throws FileNotFoundException {
        ArrayList < Contract > resultList = new ArrayList < Contract > ();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Scanner scan = new Scanner(new File(filePath));
        try {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                resultList.add(new Contract(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), formatter.parse(lineArray[2]), lineArray[2], Integer.parseInt(lineArray[4]), Integer.parseInt(lineArray[5])));
            }
        }
        catch (ParseException e){
            System.out.println("Parse exception"+ e);
        }


        return resultList;
    }
    public Integer getNumberOfContracts(String filePath) throws FileNotFoundException {
        ArrayList<Contract> resultList = new ArrayList<Contract>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scan = new Scanner(new File(filePath));
        try {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(",");
                resultList.add(new Contract(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), formatter.parse(lineArray[2]), lineArray[3], Integer.parseInt(lineArray[4]), Integer.parseInt(lineArray[4])));
            }
        } catch (ParseException e) {
            System.out.println("Java Date parse exception" + e);
        }
        return resultList.size();
    }


}
