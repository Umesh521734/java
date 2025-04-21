interface shape{               
    abstract void perimeter();
}
class rectangle implements shape{
    int l,b;
    int p;
    rectangle(int l,int b){
       this.l=l; 
       this.b=b;
  }
public void perimeter(){
    p=2*(l+b);
   System.out.println("Perimeter is"+p);
}
}
class  circle implements shape{
    int r;
    int p;
    circle(int r){
       this.r=r;
  }
public void perimeter(){
    p=2*MATH.PI*r;
   System.out.println("Perimeter is"+p);
}
}
class triangle implements shape{
    int s1,s2,s3 ;
    int p;
    triangle(int s1,int s2,int s3){
 
       this.s1=s1 ; 
       this.s2=s2 ;
       this.s3=s3 ;
  }
public void perimeter(){
    p=s1+s2+s3;
   System.out.println("Perimeter is"+p);
}
}
class shapes{
public static void main(String[] args){
    triangle t=new triangle(2,3,4);
    rectangle r=new rectangle(3,2);
    circle c=new circle(4);
    t.perimeter();
    r.perimeter();
    c.perimeter();
 }
}
