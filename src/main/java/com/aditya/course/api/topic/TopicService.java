package com.aditya.course.api.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;
    
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("1", "Aditya", "Roll No. 61"),
        new Topic("2", "Adi", "Roll No. 60"),
        new Topic("3", "Yash", "Roll No. 59"),
        new Topic("4", "Aman", "Roll No. 70")));
    
    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topic = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topic::add);
        return  topic;
    }
    
    public Topic getTopic(String id){
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
//        Topic topic = null;
//        for(Topic t:topics){
//            if(t.getId().equals(id)){
//                topic= t;
//                break;
//            }
//        }
//        
//        return topic;
        return topicRepository.findOne(id);
    }
    
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
    
    public void updateTopic(Topic topic,String id){
//        for(int i=0;i<topics.size();i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);   //It will check if the row with id exist or not if it exist then it will update that
    }

    public void deleteTopic(String id) {
//        for(int i=0;i<topics.size();i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.remove(i);
//                return;
//            }
//        }
        //topics.removeIf(t->t.getId().equals(id));   //This is for java* stream and Lamda function implementation
        topicRepository.delete(id);
    }
    
}
