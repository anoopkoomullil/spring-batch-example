package com.javatechie.spring.batch.repository;

import com.javatechie.spring.batch.entity.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, Integer> {
}
