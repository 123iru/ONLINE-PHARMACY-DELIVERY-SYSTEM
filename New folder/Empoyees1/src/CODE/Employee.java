/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Employee {
    private String EmpImgPath;
    private String EmpNIC;
    private String EmpName;
    private int EmpAge;
    private String EmpDOB;
    private String EmpEmail;
    private int EmpContact;
    private int EmpHotline;
    private boolean EmpGender;
    private String EmpAddress;

    public Employee(String EmpImgPath, String EmpNIC, String EmpName, int EmpAge, String EmpDOB, String EmpEmail, int EmpContact, int EmpHotline, boolean EmpGender, String EmpAddress) {
        this.EmpImgPath = EmpImgPath;
        this.EmpNIC = EmpNIC;
        this.EmpName = EmpName;
        this.EmpAge = EmpAge;
        this.EmpDOB = EmpDOB;
        this.EmpEmail = EmpEmail;
        this.EmpContact = EmpContact;
        this.EmpHotline = EmpHotline;
        this.EmpGender = EmpGender;
        this.EmpAddress = EmpAddress;
    }

    public String getEmpImgPath() {
        return EmpImgPath;
    }

    public String getEmpNIC() {
        return EmpNIC;
    }

    public String getEmpName() {
        return EmpName;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public String getEmpDOB() {
        return EmpDOB;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public int getEmpContact() {
        return EmpContact;
    }

    public int getEmpHotline() {
        return EmpHotline;
    }

    public boolean isEmpGender() {
        return EmpGender;
    }

    public String getEmpAddress() {
        return EmpAddress;
    }
    
    
}
