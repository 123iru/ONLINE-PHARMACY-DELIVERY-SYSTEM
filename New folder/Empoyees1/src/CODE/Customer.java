/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Customer {
    private String CusImgPath;
    private String CusNic;
    private String CusFName;
    private String CusSName;
    private String CusEmail;
    private String CusPassword;
    private String CusDOB;
    private int CusContactNo;
    private boolean CusGender;
    private String CusAddress;

    public Customer(String CusImgPath, String CusNic, String CusFName, String CusSName, String CusEmail, String CusPassword, String CusDOB, int CusContactNo, boolean CusGender, String CusAddress) {
        this.CusImgPath = CusImgPath;
        this.CusNic = CusNic;
        this.CusFName = CusFName;
        this.CusSName = CusSName;
        this.CusEmail = CusEmail;
        this.CusPassword = CusPassword;
        this.CusDOB = CusDOB;
        this.CusContactNo = CusContactNo;
        this.CusGender = CusGender;
        this.CusAddress = CusAddress;
    }

    public String getCusImgPath() {
        return CusImgPath;
    }

    public String getCusNic() {
        return CusNic;
    }

    public String getCusFName() {
        return CusFName;
    }

    public String getCusSName() {
        return CusSName;
    }

    public String getCusEmail() {
        return CusEmail;
    }

    public String getCusPassword() {
        return CusPassword;
    }

    public String getCusDOB() {
        return CusDOB;
    }

    public int getCusContactNo() {
        return CusContactNo;
    }

    public boolean isCusGender() {
        return CusGender;
    }

    public String getCusAddress() {
        return CusAddress;
    }
    
    
}
