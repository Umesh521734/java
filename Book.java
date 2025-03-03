 class Book{
    public String title ;
    public String author;
    public String year_of_publication;
        public Book(String  title, String  author, String year_of_publication)
                {
                this. title= title;
                this. author= author;
                this. year_of_publication= year_of_publication;
               }
               public void display(){
                System.out.println("titile of the book is "+ title);
                System.out.println("author of the book is "+author);
                System.out.println("year of the publication "+year_of_publication);
               }
                     public static void main(String[] args){
                Book book1=new  Book("MARVEL",  "JAMES",  "2024");
                Book book2=new  Book( "VEGOM",  "DEV", "2025");
               book1.display();
               book2.display();
       {
        System.out.println(book1);
        System.out.println(book2);
       
     }
    }
}