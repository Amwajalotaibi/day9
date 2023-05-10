public class Book extends Product {
    private String author; //مؤلف

    public Book(){

        super();

    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String name, Double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    double getDiscount() {
        System.out.println("please to choose name of Book "+getName());
        System.out.println("please to choose name of Author"+getAuthor());


        return (double) (15 * getPrice()) /100;
    }


}

