class Vehicle{
     public void displayInfo(String comp,String model, int price,String seating,boolean petrol){
               System.out.println("details");
     }
}

class car extends Vehicle{
      public void displayInfo(String comp,String model, int price,String seating,boolean petrol){
               System.out.println("Car details");
               System.out.println("Car company:"+comp);
               System.out.println("Car model:"+model);
               System.out.println("Car price:"+price);
               System.out.println("Car seating:"+seating);
                
               System.out.println("Petrol"+petrol);
      }
}
class implement{
      public static void main(String[] args){
          car c=new car();
          c.displayInfo("tata","200ec",1200000,"6" ,true);
      }
}