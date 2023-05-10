public class Movie extends Product {
    private String director;

    public Movie(){
        super();

    }

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, Double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    double getDiscount(){
        System.out.println("please to choose name of movie "+getName());
        System.out.println("please to choose name of Director "+getDirector());

        return (double) (10*getPrice())/100;
    }
}
