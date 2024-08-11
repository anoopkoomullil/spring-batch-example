package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Notification;
import org.springframework.batch.item.ItemProcessor;

public class NotificationProcessor implements ItemProcessor<Notification,Notification> {
    @Override
    public Notification process(Notification notification) throws Exception {
        if(notification.getCountry().equals("United States")) {
            return notification;
        }else{
            return null;
        }
    }
}
