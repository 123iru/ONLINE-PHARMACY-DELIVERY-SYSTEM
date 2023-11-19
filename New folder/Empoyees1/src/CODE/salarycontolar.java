/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODE;

public class salarycontolar {
    ACCOUNT objACCOUNT ;
    public ACCOUNT addACCOUNT(String Name, float Salary,float Rate )
    {
        objACCOUNT=new  ACCOUNT(Name,Salary,Rate  );
        return  objACCOUNT;
    }

}
