
package se.nackademin.librarytest.model;

import java.util.Date;


public class Book {

    private Integer idBook;
    private String titleBook;
    private String author;
    private String descriptionBook;
    private String isbn;
    private String datePublishedBook;
    private Integer nbrAvailableBook;
    private Date dateBorrow;
    private Date dateDUE;
    private Integer pageNr;

    /**
     * @return the id
     */
    public Integer getIdBook() {
        return idBook;
    }

    /**
     * @param idBook the id to set
     */
    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    /**
     * @return the title
     */
    public String getTitleBook() {
        return titleBook;
    }

    /**
     * @param titleBook the title to set
     */
    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the description
     */
    public String getDescriptionBook() {
        return descriptionBook;
    }

    /**
     * @param descriptionBook the description to set
     */
    public void setDescriptionBook(String descriptionBook) {
        this.descriptionBook = descriptionBook;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the datePublished
     */
    public String getDatePublishedBook() {
        return datePublishedBook;
    }

    /**
     * @param datePublishedBook the datePublished to set
     */
    public void setDatePublishedBook(String datePublishedBook) {
        this.datePublishedBook = datePublishedBook;
    }

    /**
     * @return the nbrAvailable
     */
    public Integer getNbrAvailableBook() {
        return nbrAvailableBook;
    }

    /**
     * @param nbrAvailableBook the nbrAvailable to set
     */
    public void setNbrAvailableBook(Integer nbrAvailableBook) {
        this.nbrAvailableBook = nbrAvailableBook;
    }

    /**
     * @return the dateBorrow
     */
    public Date getDateBorrow() {
        return dateBorrow;
    }

    /**
     * @param dateBorrow the dateBorrow to set
     */
    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    /**
     * @return the dateDUE
     */
    public Date getDateDUE() {
        return dateDUE;
    }

    /**
     * @param dateDUE the dateDUE to set
     */
    public void setDateDUE(Date dateDUE) {
        this.dateDUE = dateDUE;
    }

    /**
     * @return the pageNr
     */
    public Integer getPageNr() {
        return pageNr;
    }

    /**
     * @param pageNr the pageNr to set
     */
    public void setPageNr(Integer pageNr) {
        this.pageNr = pageNr;
    }

}
