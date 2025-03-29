class cal{
   public int add(int a,int b){
        return a+b;
   }
   public double add(double a,double b){
        return a+b;
   }
   public int add(int a,int b ,int c ){
        return a+b+c;
   }
}

class bcal{
     public static void main(String[] args){
      cal c=new cal() ;
      System.out.println(c.add(6,7)); 
      System.out.println(c.add(5.5,7.7));
      System.out.println(c.add(6,7,8)); 
   }
}