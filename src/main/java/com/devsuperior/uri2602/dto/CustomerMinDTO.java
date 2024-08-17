package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.CustomerMinProjection;

public class CustomerMinDTO {

    //attribute
    private String name;

    //constructor without parameters
    public CustomerMinDTO () {
    }

    //constructor with parameters
    public CustomerMinDTO(String name) {
        this.name = name;
    }

    //constructor received CustomerMinProjection
    public CustomerMinDTO(CustomerMinProjection projection) {
        name = projection.getName();
    }

    //get  and set method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString method for print object
    @Override
    public String toString() {
        return "CustomerMinDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
