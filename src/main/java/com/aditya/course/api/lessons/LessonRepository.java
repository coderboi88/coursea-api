/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aditya.course.api.lessons;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author hp
 */
public interface LessonRepository extends CrudRepository<Lesson, String>{
    public List<Lesson> findByCourseId(String courseid);
}
