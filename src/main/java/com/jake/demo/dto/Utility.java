package com.jake.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "utility")
public class Utility {
    private String name;
    private Integer sum;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSum() {
        return sum;
    }
    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
