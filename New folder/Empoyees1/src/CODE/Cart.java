/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Cart {
    private String Date;
    private String DrugImgPath;
    private int DrugID;
    private String DrugName;
    private double DrugPrice;
    private int DrugQuantity;
    private double TotalDrugPrice;

    public Cart(String Date, String DrugImgPath, int DrugID, String DrugName, double DrugPrice, int DrugQuantity, double TotalDrugPrice) {
        this.Date = Date;
        this.DrugImgPath = DrugImgPath;
        this.DrugID = DrugID;
        this.DrugName = DrugName;
        this.DrugPrice = DrugPrice;
        this.DrugQuantity = DrugQuantity;
        this.TotalDrugPrice = TotalDrugPrice;
    }

    public String getDate() {
        return Date;
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

    public double getTotalDrugPrice() {
        return TotalDrugPrice;
    }
    
    
}
