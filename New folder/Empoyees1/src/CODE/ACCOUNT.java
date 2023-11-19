/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

 
public class ACCOUNT extends SALARY{
    private float Rate;
     
    static int totACCOUNT;
    public ACCOUNT(String Name, float Salary,float Rate ){
        super (Name,Salary);
        this.Rate=Rate;
         
        totACCOUNT++;
    }
    public ACCOUNT()
    {
        super();
         this.Rate=0.0f;
         
         totACCOUNT++;
        
    }
    public float calculateSalary(){
        return super.getSalary()* Rate+super.getSalary();
    }
    @Override
    public String printSalary(){
        return super.printSalary()+" "+this.Rate+" " ;
        
    }

    public float getRate() {
        return Rate;
    }

    public void setRate(float Rate) {
        this.Rate = Rate;
    }

    

    public static int getTotACCOUNT() {
        return totACCOUNT;
    }
    
    
    
}
