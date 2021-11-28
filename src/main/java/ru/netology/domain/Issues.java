package ru.netology.domain;

public class Issues {
    private int id;
    private String date;
    private String text;
    private String author;
    private String teg;
    private String closed;
    private String assignee;
    private String label;

    public Issues(int id, String date, String text, String author, String teg, String closed, String assignee, String label) {
        this.id = id;
        this.date = date;
        this.text = text;
        this.author = author;
        this.teg = teg;
        this.closed = closed;
        this.assignee = assignee;
        this.label = label;
    }

    public Issues(String author, String closed, String assignee, String label) {
        this.author = author;
        this.closed = closed;
        this.assignee = assignee;
        this.label = label;
    }

    public Issues() {
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
