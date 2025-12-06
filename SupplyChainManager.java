package finalprojectgrp9;

import java.util.ArrayList;

public class SupplyChainManager {
    private ArrayList<Supplier> suppliers;
    private String managerName;
    private int managerID;


    public SupplyChainManager() {
        this.suppliers = suppliers;
        this.managerName = managerName;
        this.managerID = managerID;
    }


    public String getManagerName() {
        return managerName;
    }


    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }


    public int getManagerID() {
        return managerID;
    }


    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    
    public void addSupplier(Supplier supplierName) {
        suppliers.add(supplierName);
    }

    public void removeSupplier(Supplier supplierName) {
        suppliers.remove(supplierName);
    }

    



    
    
}
