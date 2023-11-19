/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Supplier {
    private int SupplierID;
    private String SupplierName;
    private String SupEmail;
    private int SupHotline;
    private int ContactNo;
    private String SupAddress;

    public Supplier(int SupplierID, String SupplierName, String SupEmail, int SupHotline, int ContactNo, String SupAddress) {
        this.SupplierID = SupplierID;
        this.SupplierName = SupplierName;
        this.SupEmail = SupEmail;
        this.SupHotline = SupHotline;
        this.ContactNo = ContactNo;
        this.SupAddress = SupAddress;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public String getSupEmail() {
        return SupEmail;
    }

    public int getSupHotline() {
        return SupHotline;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public String getSupAddress() {
        return SupAddress;
    }
    
    
}
