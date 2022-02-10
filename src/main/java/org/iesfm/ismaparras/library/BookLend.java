package org.iesfm.ismaparras.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Objects;

public class BookLend {
    private final static Logger log = LoggerFactory.getLogger(BookLend.class);
    private String isbn;
    private Date lendDate;
    private String nifReceiver;

    public BookLend(String isbn, Date lendDate, String nifReceiver) {
        this.isbn = isbn;
        this.lendDate = lendDate;
        this.nifReceiver = nifReceiver;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getLendDate() {
        return lendDate;
    }

    public void setLendDate(Date lendDate) {
        this.lendDate = lendDate;
    }

    public String getNifReceiver() {
        return nifReceiver;
    }

    public void setNifReceiver(String nifReceiver) {
        this.nifReceiver = nifReceiver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLend bookLend = (BookLend) o;
        return Objects.equals(isbn, bookLend.isbn) && Objects.equals(lendDate, bookLend.lendDate) && Objects.equals(nifReceiver, bookLend.nifReceiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, lendDate, nifReceiver);
    }

    @Override
    public String toString() {
        return "BookLend{" +
                "isbn='" + isbn + '\'' +
                ", lendDate=" + lendDate +
                ", nifReceiver='" + nifReceiver + '\'' +
                '}';
    }
}
