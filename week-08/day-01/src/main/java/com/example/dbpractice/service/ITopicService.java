package com.example.dbpractice.service;

import com.example.dbpractice.model.Topic;

import java.util.List;

public interface ITopicService {

  List<Topic> findAll();
  Topic findById(long id);
  void save(Topic topic);
  void delete(long id);
}
