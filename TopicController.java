package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Restcontroller creates new instance
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	//map to any method on /topics a shortcut
	public List<Topic> getAllTopics(){
		return topicService.getAlltopics();
		
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	//map this method to any request ie post and /topics 
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	//map this method to any request ie post and /topics 
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id,topic);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	
	}
	
}