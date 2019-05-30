package com.example.dbpractice.service;

import com.example.dbpractice.model.Topic;
import com.example.dbpractice.repository.ITopicRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServiceImp implements ITopicService {

  private ITopicRepository topicRepository;

  public TopicServiceImp(ITopicRepository topicRepository) {
    this.topicRepository = topicRepository;
  }

  @Override
  public List<Topic> findAll() {
    List<Topic> topicList = new ArrayList<>();
    topicRepository.findAll().forEach(topic -> topicList.add(topic));
    return topicList;
  }

  @Override
  public Topic findById(long id) {
    return topicRepository.findById(id).orElse(null);
  }

  @Override
  public void save(Topic topic) {
    topicRepository.save(topic);
  }

  @Override
  public void delete(long id) {
    topicRepository.deleteById(id);
  }
}