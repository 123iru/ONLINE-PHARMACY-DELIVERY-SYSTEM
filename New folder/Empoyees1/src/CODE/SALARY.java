/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

 
public abstract class SALARY { 

    private String Name;
     private  float Salary;

    public SALARY(String Name, float Salary) {
        this.Name = Name;
        this.Salary = Salary;

    }

    public SALARY() {
        this.Name = null;
        this.Salary = 0;

    }

    public String printSalary() {
        return Name + "(" + Salary + ")";
    }

    public String getName() {
        return this.Name;
    }

    public float getSalary() {
        return this.Salary;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

}
