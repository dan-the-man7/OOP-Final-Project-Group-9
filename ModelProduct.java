package finalprojectgrp9;

public class ModelProduct {
    private String productName;
    private int productID;
    private Supplier productSupplier;
    private String productType;

    //  Parametized Constructor
    public ModelProduct(String productName, int productID, Supplier productSupplier, String productType){
        this.productName= productName;
        this.productID=productID;
        this.productSupplier=productSupplier;
        this.productType=productType;
    }

    // Accessors
    public String getProductName(){
        return productName;
    }
    public int getProductID(){
        return productID;
    }
    public Supplier getProductSupplier(){
        return productSupplier;
    }
    public String getProductType(){
        return productType;
    }
    // Mutators
    public void setProductName(String productName){
        this.productName=productName;
    }
    public void setProductID(int productID){
        this.productID=productID;
    }
    public void setProductSupplier(Supplier productSupplier){
        this.productSupplier=productSupplier;
    }
    public void setProductType(String productType){
        this.productType=productType;
    }

    // Equals Method

    @Override

    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ModelProduct other = (ModelProduct) obj;

        return this.productName.equals(other.productName) && this.productID == other.productID;
    }

    @Override

    public int hashCode() {
        int hash = 7;

        hash = 31 * hash + productID;
        hash = 31 * hash + (productName == null ? 0 : productName.hashCode());
        hash = 31 * hash + (productSupplier == null ? 0 : productSupplier.hashCode());
        hash = 31 * hash + (productType == null ? 0 : productType.hashCode());

        return hash;
    }
}
    
