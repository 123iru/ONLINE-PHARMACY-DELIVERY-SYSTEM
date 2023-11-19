/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Order {
    private String Date;
    private int OrderID;
    private String CusNIC;
    private boolean DeliveryMethod;
    private boolean PaymentMethod;
    private double TotalBill;

    public Order(String Date, int OrderID, String CusNIC, boolean DeliveryMethod, boolean PaymentMethod, double TotalBill) {
        this.Date = Date;
        this.OrderID = OrderID;
        this.CusNIC = CusNIC;
        this.DeliveryMethod = DeliveryMethod;
        this.PaymentMethod = PaymentMethod;
        this.TotalBill = TotalBill;
    }

    public String getDate() {
        return Date;
    }

    public int getOrderID() {
        return OrderID;
    }

    public String getCusNIC() {
        return CusNIC;
    }

    public boolean isDeliveryMethod() {
        return DeliveryMethod;
    }

    public boolean isPaymentMethod() {
        return PaymentMethod;
    }

    public double getTotalBill() {
        return TotalBill;
    }
    
    
}
