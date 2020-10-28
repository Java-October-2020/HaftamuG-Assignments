package com.haftamu.updateAndDelete.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String language;
    private Integer numberOfPages;
    
    public Book() {
    }
    public Book(String title, String desc, String lang, int pages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;
    }
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
 	public String getLanguage() {
 		return language;
 	}
 	public void setLanguage(String language) {
 		this.language = language;
 	}
 	public Integer getNumberOfPages() {
 		return numberOfPages;
 	}
 	public void setNumberOfPages(Integer numberOfPages) {
 		this.numberOfPages = numberOfPages;
 	}
}