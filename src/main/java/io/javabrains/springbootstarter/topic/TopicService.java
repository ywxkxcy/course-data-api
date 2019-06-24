package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService { // business services are singletons

    @Autowired
    private TopicRepository topicRepository; // with autowired it can inject the topic repository

//    private List<Course> topics = new ArrayList<>(Arrays.asList(
//            new Course("spring", "SpringFramework", "description"),
//            new Course("java", "core java", "description java"),
//            new Course("js", "javascript", "description js")
//            ));

    public List<Topic> getAllTopics() {
        // return topics
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
////            Course t = topics.get(i);
////            if (t.getId().equals(id)) {
////                topics.set(i, topic);
////                return;
////            }
////        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
