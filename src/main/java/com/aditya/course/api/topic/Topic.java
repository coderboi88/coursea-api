/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.course.api.topic;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 *
 * @author hp
 */
@Entity
public class Topic {
     
    @Id  //This is used to define primary key
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        
        this.id = id;
        this.name = name;
        this.description = description;
    }
           
}
