package com.libraryfine.library;
import jakarta.persistence.*;
@Entity
public class Member {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name; private String email;
 public Member(){} public Member(String name,String email){this.name=name;this.email=email;}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String n){name=n;}
 public String getEmail(){return email;} public void setEmail(String e){email=e;}
}
