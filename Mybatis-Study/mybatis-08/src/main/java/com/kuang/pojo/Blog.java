package com.kuang.pojo;

import java.util.Date;

public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createDate;
    private int views;

//    public Blog(String id, String author, Date createDate, int views) {
//        this.id = id;
//        this.author = author;
//        this.createDate = createDate;
//        this.views = views;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                ", views=" + views +
                '}' + '\n';
    }
}
