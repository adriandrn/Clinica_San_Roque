package com.emergentes.models;


public class Query {
    private int id;
    private int user_id;
    private String description;
    private String query_date;
    private String user_name;
    private String user_path;

    public Query() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getQuery_date() {
        return query_date;
    }
    public void setQuery_date(String query_date) {
        this.query_date = query_date;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_path() {
        return user_path;
    }

    public void setUser_path(String user_path) {
        this.user_path = user_path;
    }
    
}
