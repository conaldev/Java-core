public class Book {
    private int bookCode;
    private String name;
    private int price;
    private String author;

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book(){}

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
