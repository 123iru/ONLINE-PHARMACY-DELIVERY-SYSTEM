
package CODE;

/**
 *
 * @author DELL
 */
public class Myproject {
    
    private String Name;
    private String Email;
    private String Contact_no;
    
    public Myproject ( String Name, String Email, String Contact_no){
        this.Name = Name;
        this.Email = Email;
        this.Contact_no = Contact_no;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name= Name;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email= Email;
    }
    public String getContact_no(){
        return Contact_no;
    }
    public void setContact_no(String Contact_no){
        this.Contact_no= Contact_no;
    }
    
 
   public class Homepage {
        private String Delivery_address;
        
        public Homepage ( String Delivery_address){
            this.Delivery_address= Delivery_address;
        }
        public String getDelivery_address(){
            return Delivery_address;
        }
        public void setDelivery_address(String Delivery_address){
            this.Delivery_address=Delivery_address;
        }
        
        
     public class Cart {
         private String itemName;
         private double itemPrice;
         int quantity;
         
         
        public Cart (String itemName,double itemPrice,int quantity){
            this.itemName= itemName;
            this.itemPrice= itemPrice;
            this.quantity= quantity;
        }
       public String getitemName(){
           return itemName;
       }
       public void setitemName(String itemName){
           this.itemName= itemName;
       }
       public double getiteamPrice(){
           return itemPrice;
       }
       public void setitemPrice(double itemPrice){
           this.itemPrice=itemPrice;
       }
       public int getquantity(){
           return quantity;
       }
       public void setquantity(int quantity){
           this.quantity=quantity;
       }
     }
     public class order{
         private String itemName;
         private String Email;
         private String Contact_no;
         private String item_no;
         private double itemPrice;
         
         public order ( String itemName, String Email, String Contact_no, String item_no, double itemPrice){
             this.itemName=itemName;
             this.Email= Email;
             this.Contact_no= Contact_no;
             this.item_no=item_no;
             this.itemPrice=itemPrice;
         }
         public String getiteamName(){
             return itemName;
         }
         public void setitemName(String iteamName){
             this.itemName= itemName;
         }
         public String getEmail(){
             return Email;
         }
         public void setEmail(String Email){
             this.Email= Email;
         }
         public String Contact_no(){
             return Contact_no;
         }
         public void setContact_no(String Contact_no){
             this.Contact_no=Contact_no;
         }
         public String getitem_no(){
             return item_no;
         }
         public void setiteam_no(String item_no){
             this.item_no=item_no;
         }
         public double getitemPrice(){
             return itemPrice;
         }
         public void setitemPrice(double itemPrice){
             this.itemPrice=itemPrice;
         }
     }
     
             
             
             
         }
     }
       
        
        }
     
        
     
     
 
    
}
