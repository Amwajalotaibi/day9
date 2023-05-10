// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Movie
        Movie m1=new Movie("Rapunzel",100.05,"Wilhelm Grimm");
        System.out.println(m1.getDiscount());

        //Book
        Book b1=new Book( "Ame");
        Book b2=new Book("Do not be sad",90.99,"A'aidh Al Karani");
        System.out.println(b2.getDiscount());

    }
}