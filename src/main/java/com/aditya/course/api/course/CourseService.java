package com.aditya.course.api.course;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;
    
    public List<Course> getAllCourses(String topicid){
        //return topics;
        List<Course> course= new ArrayList<>();
        courseRepository.findByTopicId(topicid)
                .forEach(course::add);
        return  course;
    }
    
    public Course getCourse(String id){
        return courseRepository.findOne(id);
    }
    
    public void addCourse(Course course){
        courseRepository.save(course);
    }
    
    public void updateCourse(Course course){
        courseRepository.save(course);   //It will check if the row with id exist or not if it exist then it will update that
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
    
}
