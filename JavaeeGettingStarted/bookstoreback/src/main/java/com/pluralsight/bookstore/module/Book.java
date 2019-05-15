package com.pluralsight.bookstore.module;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 200)
    @NotNull
    @Size(min = 1,max = 200)
    private String title;

    @Column(length = 10000)
    @Size(min = 1,max = 10000)
    private String description;

    @NotNull
    @Size(min = 1,max = 50)
    private String isbn;

    @Column(name = "nb_of_pages")
    private Integer nbOfPages;


    @Column(name = "unit_cost")
    @Min(1)
    private Float unitCost;

    @Temporal(TemporalType.DATE)
    @Column(name = "publication_date")
    @Past
    private Date publicationDate;

    @Column(name = "image_url")
    private String imageUrl;

    //Contructors


    public Book() {
    }

    public Book(String title, String description, String isbn, Integer nbOfPages, Float unitCost, Date publicationDate, String imageUrl, Language language) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.nbOfPages = nbOfPages;
        this.unitCost = unitCost;
        this.publicationDate = publicationDate;
        this.imageUrl = imageUrl;
        this.language = language;
    }

    private Language language;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public Float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Float unitCost) {
        this.unitCost = unitCost;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", nbOfPages=" + nbOfPages +
                ", unitCost=" + unitCost +
                ", publicationDate=" + publicationDate +
                ", imageUrl='" + imageUrl + '\'' +
                ", language=" + language +
                '}';
    }
}
