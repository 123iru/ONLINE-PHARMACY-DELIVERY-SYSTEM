/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Drug {
    private String DrugImgPath;
    private int DrugID;
    private String DrugName;
    private double DrugPrice;
    private int DrugQuantity;
    private int SupplierID;
    private String SupplierName;

    public Drug(String DrugImgPath, int DrugID, String DrugName, double DrugPrice, int DrugQuantity, int SupplierID, String SupplierName) {
        this.DrugImgPath = DrugImgPath;
        this.DrugID = DrugID;
        this.DrugName = DrugName;
        this.DrugPrice = DrugPrice;
        this.DrugQuantity = DrugQuantity;
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
    }

    public String getDrugImgPath() {
        return DrugImgPath;
    }

    public int getDrugID() {
        return DrugID;
    }

    public String getDrugName() {
        return DrugName;
    }

    public double getDrugPrice() {
        return DrugPrice;
    }

    public int getDrugQuantity() {
        return DrugQuantity;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }
    
    
    
    
}
