package com.libraryfine.library;
import jakarta.persistence.*;
@Entity
public class Book {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String title; private String author; @Column(unique=true) private String isbn;
 public Book(){} public Book(String t,String a,String i){title=t;author=a;isbn=i;}
 public Long getId(){return id;} public String getTitle(){return title;} public void setTitle(String x){title=x;}
 public String getAuthor(){return author;} public void setAuthor(String x){author=x;}
 public String getIsbn(){return isbn;} public void setIsbn(String x){isbn=x;}
}
