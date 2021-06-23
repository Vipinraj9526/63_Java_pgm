
 class Product
 {
   String pno;
   String pname;
   double price;
   
   Product(String no,String n,double p){
    pno=no;
    pname=n;
    price=p;
   }
 }
 class Productdemo2
 {
   
   public static void main(String args[])
   { 
   Product p1=new Product("A01","Soap",50);
   Product p2=new Product("A02","Paste",25);
   Product p3=new Product("A03","Book",100);
   
   if(p1.price > p2. price && p1.price > p3.price)
   {
     System.out.println("highest price for "+p1.pname);
   }
   else if(p2.price >p3.price){
     System.out.println("highest price for "+p2.pname);
      }
   else
   {
     System.out.println("highest price for "+p3.pname);
   }
    System.out.println("Exit");
   }
 }
