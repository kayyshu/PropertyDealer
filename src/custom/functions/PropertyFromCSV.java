package custom.functions;

import custom.utils.Property;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyFromCSV {
    public ArrayList<Property> processCSVToPropertyList(String filePath) throws FileNotFoundException {
        ArrayList < Property > resultList = new ArrayList <> ();
        Scanner scan = new Scanner(new File(filePath));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(",");
            resultList.add(new Property(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), lineArray[2], Integer.parseInt(lineArray[3]), Integer.parseInt(lineArray[4]),Integer.parseInt(lineArray[5]),lineArray[6],Integer.parseInt(lineArray[7]),Integer.parseInt(lineArray[8])));
        }
        return resultList;
    }

    public Integer getNumberOfProperties(String filePath) throws FileNotFoundException {
        ArrayList < Property > resultList = new ArrayList <> ();
        Scanner scan = new Scanner(new File(filePath));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(",");
            resultList.add(new Property(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), lineArray[2], Integer.parseInt(lineArray[3]), Integer.parseInt(lineArray[4]),Integer.parseInt(lineArray[5]),lineArray[6],Integer.parseInt(lineArray[7]),Integer.parseInt(lineArray[8])));
        }
        return resultList.size();
    }

}
