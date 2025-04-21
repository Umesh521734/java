interface login{
      abstract void check(String password,String username);
}
class portal implements login{
      public void check (String password,String username){
          if(password.equals("456")&& username.equals("hello")){ 
                 System.out.println("SUCCESFULL");
           }
          else{
                System.out.println("UNSUCCESFULL");
           }
      }
}
class solo{
       public static void main(String[] args){
            System.out.println("UMESH CHANDRA REDDY,av.sc.u4cse24037,CSE-A");
             portal p=new portal();
             p.check("456","hello");
             p.check("456","456");
         }
}