package com.aditya.course.api.lessons;

import com.aditya.course.api.course.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessonController {
    
    @Autowired
    private LessonService lessonService;
    
    @RequestMapping("/topics/{topicid}/courses/{courseid}/lessons")
    public List<Lesson> getAllLesson(@PathVariable String topicid,@PathVariable String courseid){
        return lessonService.getAllLesson(courseid);
    } 
    
    @RequestMapping("/topics/{topicid}/courses/{courseid}/lessons/{id}")
    public Lesson getLesson(@PathVariable String id){
        return lessonService.getLesson(id);
    }
    
    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicid}/courses/{courseid}/lessons")
    public void addLesson(@RequestBody Lesson lesson,@PathVariable String topicid,@PathVariable String courseid){
        lesson.setCourse(new Course(courseid,"","",topicid));
        lessonService.addLesson(lesson);
    }
    
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicid}/courses/{courseid}/lessons/{id}")
    public void updateLesson(@RequestBody Lesson lesson,@PathVariable String topicid,@PathVariable String courseid){
        lesson.setCourse(new Course(courseid,"","",topicid));
        lessonService.updateLesson(lesson);
    }
    
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicid}/courses/{courseid}/lessons/{id}")
    public void deleteLesson(@PathVariable String id){
        lessonService.deleteLesson(id);
    }
}
