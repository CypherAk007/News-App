package com.example.allnewsapp;

import java.util.ArrayList;

public class MainNews {

    private String status;
//    Total no . of resultsfetched
    private String totalResults;
//    array name is articles as we have to fetch the articles array fm newsapi.org
//    Type of array is model class as we want data of those values
    private ArrayList<ModelClass> articles;

    public MainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
