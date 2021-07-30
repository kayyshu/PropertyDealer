package custom.functions;

import custom.utils.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DisplayProperty {
    public void displayAllProperty(String property_path, String sale_path,String contract_path,String vendor_path) {
        PropertyFromCSV propertyFromCSV = new PropertyFromCSV();
        SaleFromCSV saleFromCSV=new SaleFromCSV();
        ContractFromCSV contractFromCSV=new ContractFromCSV();
        VendorFromCSV vendorFromCSV= new VendorFromCSV();
        try {
            List<Property> propertyList = propertyFromCSV.processCSVToPropertyList(property_path);
            List<Sale> saleList = saleFromCSV.processCSVToSaleList(sale_path);
            List<Contract> contractList = contractFromCSV.processCSVToContractList(sale_path);
            List<Vendor> vendorList = vendorFromCSV.processCSVToVendorList(sale_path);

            for(Property property:propertyList){
                for(Sale sale: saleList){
                    for (Vendor vendor: vendorList){
                        for (Contract contract: contractList){
                            if(property.getPropertyID().equals(sale.getPropertyID())){
                                List displayList= new ArrayList();
                                displayList.add()

                            }
                        }
                    }
                }
            }

        }
        catch (FileNotFoundException e){System.out.println("file not found");
        }


    }


    public void displaySoldProperty() {
    }

    public void displayForSaleProperty() {
    }

    public void displayWithdrawnProperty() {
    }
}
