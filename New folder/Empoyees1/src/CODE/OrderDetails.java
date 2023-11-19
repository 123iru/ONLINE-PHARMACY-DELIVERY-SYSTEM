/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class OrderDetails {
    private String Date;
    private int OrderID;
    private int DrugID;
    private String DrugName;
    private double DrugPrice;
    private int DrugQuantity;
    private double TotalDPrice;

    public OrderDetails(String Date, int OrderID, int DrugID, String DrugName, double DrugPrice, int DrugQuantity, double TotalDPrice) {
        this.Date = Date;
        this.OrderID = OrderID;
        this.DrugID = DrugID;
        this.DrugName = DrugName;
        this.DrugPrice = DrugPrice;
        this.DrugQuantity = DrugQuantity;
        this.TotalDPrice = TotalDPrice;
    }

    public String getDate() {
        return Date;
    }

    public int getOrderID() {
        return OrderID;
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

    public double getTotalDPrice() {
        return TotalDPrice;
    }
    
    
}
