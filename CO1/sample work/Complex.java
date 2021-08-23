//pgm 3

 // Compiler version JDK 11.0.2
 class compNum{
   
   double real;
   double img;
 }
 class Complex
 {
   public static void main(String args[])
   { 
    compNum c1=new compNum();
    compNum c2=new compNum();
    
    c1.real=5;
    c1.img=4;
    
    c2.real=5;
    c2.img=6;
    
    
    System.out.println(c1.real+c2.real+"+"+c1.img+c2.img+"i");
   }
 }
