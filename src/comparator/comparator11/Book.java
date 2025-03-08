package comparator.comparator11;

import java.time.LocalDate;

public class Book {

    String title;

    public Book(String title, LocalDate publishDate) {
        this.title = title;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    LocalDate publishDate;
}
