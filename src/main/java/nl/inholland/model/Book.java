package nl.inholland.model;

/**
 * Created by nmk25 on 23.04.2019.
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private String publishYear;

    public Book(String id, String title, String author, String category, String publishYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishYear = publishYear;
    }

    public Book(){

    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", publishYear='" + publishYear + '\'' +
                '}';
    }

}
