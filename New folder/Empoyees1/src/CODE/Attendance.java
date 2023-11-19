/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

/**
 *
 * @author Oshadi
 */
public class Attendance {
    private String NIC;
    private String Name;
    private boolean Attendance;

    public Attendance(String CusNIC, String CusName, boolean Attendance) {
        this.NIC = NIC;
        this.Name = Name;
        this.Attendance = Attendance;
    }

    public String getCusNIC() {
        return NIC;
    }

    public String getCusName() {
        return Name;
    }

    public boolean isAttendance() {
        return Attendance;
    }
    
    
}
