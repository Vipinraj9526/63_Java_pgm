import java.util.Scanner;
class unameexp extends Exception{
       unameexp(String s){
                      super(s);


      }
}
class pwdexp extends Exception{
      pwdexp(String s){
                     super(s);
       }
}
class Authentication{
       public static void main(String args[]){
           String uname,pwd;
           String cuname="vipin";
           String cpwd="vipin123";
           
           try{
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the username:");
                uname=s.nextLine();
                System.out.println("Enter the password:");
                pwd=s.nextLine();
                if(uname.equals(cuname)==false)
                    throw new unameexp("Invalid username");
                else if(pwd.equals(cpwd)==false)               
                     throw new  pwdexp("Invalid password");
                else
                     System.out.println("login successfull");
                }
                 catch(unameexp e){
                        System.out.println(e);
                  }
                  catch( pwdexp e){
                         System.out.println(e);
                  }
                 finally{
                       System.out.println("Finshed");
}
}
}