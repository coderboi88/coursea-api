/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.course.api.course;
import com.aditya.course.api.topic.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 *
 * @author hp
 */
@Entity
public class Course {
     
    @Id  //This is used to define primary key
    private String id;
    private String name;
    private String description;
    
    @ManyToOne    //With this Annotation we are letting the table know that it is a foriegn key to the table
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
    
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

    public Course() {
    }

    public Course(String id, String name, String description,String topicId) {
        
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"", "");
    }
           
}
