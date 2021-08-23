//pgm 1

 // Compiler version JDK 11.0.2
 class Item
 {
   double pcode;
   String pname;
   double price; 
   
 } 
 
 class Product
 {
   public static void main(String args[])
   {
    Item myitem1=new Item();
    Item myitem2=new Item();
    Item myitem3=new Item();
    String low;
    
    myitem1.pcode=1;
    myitem1.pname="Vipin";
    myitem1.price=500;
    
    myitem2.pcode=2;
    myitem2.pname="Aswin";
    myitem2.price=100;
    
    myitem3.pcode=3;
    myitem3.pname="Arun";
    myitem3.price=800;
    
   
     if(myitem1.price > myitem2.price)
     {
       if (myitem1.price > myitem3.price)
       {
         System.out.println(myitem1.pname);
         
       }
       else
       {
         System.out.println(myitem3.pname);
       }
     }
     else if(myitem2.price>myitem3.price)
     {
       System.out.println(myitem2.pname);
     }
   }
  
   
 }
