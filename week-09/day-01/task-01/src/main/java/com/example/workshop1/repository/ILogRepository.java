package com.example.workshop1.repository;

import com.example.workshop1.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogRepository extends CrudRepository<Log, Long> {
}