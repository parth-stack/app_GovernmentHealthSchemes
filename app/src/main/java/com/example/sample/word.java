package com.example.sample;

public class word {
    private String title;
    //private String description;
    private String link;


    public word(String link,String title){
        this.title=title;
        //this.description=description;
        this.link=link;
    }


    public String get_title() { return title; }
    //public String get_description() { return description; }
    public String get_link() { return link; }

    @Override
    public String toString() {
        return "word{" +
                "title= " + title + '\'' +
                ", link= " + link +
                '}';
    }

    public void set_title(String title) {
        this.title=title;
    }

    //public void set_description(String description) {this.description =description;}

    public void set_link(String link) {
        this.link = link;
    }
}
