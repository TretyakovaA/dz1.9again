public class Book {
    private int page;
    private static int year;
    private Author author;

    public Book (Author author, int page, int year) {
        this.author = author;
        this.page = page;
        this.year =year;


    }

    public String getAuthor() {
        return author.getFirstName()+ author.getLastName();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return this.page;
    }

    public int getYear() {
        return this.year;
    }
}
