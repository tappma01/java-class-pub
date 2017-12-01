package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * Class Book
 * @author yasiro01
 */
public class Book {
    protected final String title;
    protected final String author;
    protected Double price;
    protected final Integer year;


public Book(String title, String author, Double price, Integer year){
    this.title = title;
    this.author = author;
    this.price = price;
    this.year = year;
}

public Book(Book otherBook){
    this.title = otherBook.title;
    this.author = otherBook.author;
    this.price = otherBook.price;
    this.year = otherBook.year;
}


    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.title);
        hash = 11 * hash + Objects.hashCode(this.author);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") by " + author + " costs $" + price;
    }





}

class ByPrice implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.price < o2.price) return -1;
        if (o1.price > o2.price) return 1;
        return 0;
    }
}


class ByTitle implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}

class ByAuthor implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}


class ByYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.year.compareTo(o2.year);
    }
}




