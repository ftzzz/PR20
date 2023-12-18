package com.example.puninpr20;

public class Dataltem {

    private String key;
    private String data;

    public Dataltem() {
        // Пустой конструктор необходим для Firebase
    }

    public Dataltem(String key, String data) {
        this.key = key;
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public String getData() {
        return data;
    }
}