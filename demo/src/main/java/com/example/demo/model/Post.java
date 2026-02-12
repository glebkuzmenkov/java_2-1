package com.example.demo.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Post implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(){}
    public Post(Long id, String text, Date creationDate)
    {
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
        this.id = id;
    }

    public Integer getLikes()
    {
        return likes;
    }

    public String getText()
    {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {return id;}

    public void setLikes(Integer likes) {this.likes = likes;}
}
