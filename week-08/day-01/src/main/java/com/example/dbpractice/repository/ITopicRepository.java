package com.example.dbpractice.repository;

import com.example.dbpractice.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface ITopicRepository extends CrudRepository<Topic, Long> {
}