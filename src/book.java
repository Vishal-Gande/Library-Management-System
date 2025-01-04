public class book {

    public int id;
    public String title;
    public String author;
    public int publicationYear;
    public String ISBN;
    public book_status status;

    public book(int id, String title, String author, int publicationYear, String ISBN) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.status = book_status.AVAILABLE;
    }
}
