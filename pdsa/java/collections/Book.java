package pdsa.collections;

public class Book {

    private int id;
    private String name, publisher, author;
    private int qty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Book() {}

    public Book(int id, String name, String publisher, String author) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    public String toString() {
        return "{id: " + id +
                ", name: " + name +
                ", publisher: " + publisher +
                ", author: " + author +
                "}";
    }
}
