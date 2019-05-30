package com.example.dbpractice;

import com.example.dbpractice.model.Topic;
import com.example.dbpractice.repository.ITopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbpracticeApplication implements CommandLineRunner {

  private ITopicRepository topicRepository;

  public DbpracticeApplication(ITopicRepository topicRepository) {
    this.topicRepository = topicRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(DbpracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Topic user = new Topic();
    user.setName("Saving the Words");
    user.setDescription("How to Save the World");

    topicRepository.save(user);
  }
}