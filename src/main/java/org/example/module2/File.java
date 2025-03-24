package org.example.module2;

import java.util.Date;

public class File {
    private String absolutePath;
    private double size;
    private Date dateOfCreation;
    private String content;

    public File(String absolutePath) {
        this.absolutePath = absolutePath;
        this.size = 0.0;
        this.dateOfCreation = new Date();
        this.content = "";  
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
