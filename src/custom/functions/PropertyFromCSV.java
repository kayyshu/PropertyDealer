package custom.functions;

import custom.utils.Property;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyFromCSV {
    public ArrayList<Property> processCSVToPropertyList(String filePath) throws FileNotFoundException {
        ArrayList < Property > resultList = new ArrayList < Property > ();
        Scanner scan = new Scanner(new File(filePath));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(",");
            resultList.add(new Property(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), lineArray[2], Integer.parseInt(lineArray[3]), Integer.parseInt(lineArray[4]),Integer.parseInt(lineArray[5]),lineArray[6],Integer.parseInt(lineArray[7]),Integer.parseInt(lineArray[8])));
        }

//        System.out.println("PropertyID PropertyType PropertySpace Bathrooms Bedrooms BuildingSpace LandSpace Street getStreetNumber");
//        for(Property property: resultList){
//            System.out.print(property.getPropertyID()+" ");
//            System.out.print(property.getPropertyType()+" ");
//            System.out.print(property.getPropertySpace()+" ");
//            System.out.print(property.getBathrooms()+" ");
//            System.out.print(property.getBedrooms()+" ");
//            System.out.print(property.getBuildingSpace()+" ");
//            System.out.print(property.getLandSpace()+" ");
//            System.out.print(property.getStreet()+" ");
//            System.out.println(property.getStreetNumber());
//        }
        return resultList;
    }

    public Integer getNumberOfProperties(String filePath) throws FileNotFoundException {
        ArrayList < Property > resultList = new ArrayList < Property > ();
        Scanner scan = new Scanner(new File(filePath));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] lineArray = line.split(",");
            resultList.add(new Property(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), lineArray[2], Integer.parseInt(lineArray[3]), Integer.parseInt(lineArray[4]),Integer.parseInt(lineArray[5]),lineArray[6],Integer.parseInt(lineArray[7]),Integer.parseInt(lineArray[8])));
        }
        return resultList.size();
    }


}
